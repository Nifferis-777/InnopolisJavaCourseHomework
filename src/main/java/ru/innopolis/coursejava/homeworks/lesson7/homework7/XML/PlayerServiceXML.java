package ru.innopolis.coursejava.homeworks.lesson7.homework7.XML;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlayerServiceXML implements PlayerService {
    private final Map<Integer, Player> players = new HashMap<>();
    private int nextId = 1; // Счетчик для генерации уникальных идентификаторов
    private final String filePath = "players.xml";

    public PlayerServiceXML() {
        loadPlayers(); // Загружаем игроков из файла при инициализации
    }

    @Override
    public Player getPlayerById(int id) {
        return players.get(id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return players.values();
    }

    @Override
    public int createPlayer(String nickname) {
        Player player = new Player(nextId, nickname, 0, false);
        players.put(nextId, player);
        nextId++;
        savePlayers(); // Сохраняем изменения в файл
        return player.getId();
    }

    @Override
    public Player deletePlayer(int id) {
        Player removedPlayer = players.remove(id);
        savePlayers(); // Сохраняем изменения в файл
        return removedPlayer;
    }

    @Override
    public int addPoints(int playerId, int points) {
        Player player = players.get(playerId);
        if (player != null) {
            player.setPoints(player.getPoints() + points);
            savePlayers(); // Сохраняем изменения в файл
            return player.getPoints();
        }
        return 0; // Если игрок не найден, возвращаем 0
    }

    // Метод для загрузки игроков из XML файла
    private void loadPlayers() {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                return; // Файл не найден, просто выходим
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("player");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;

                    int id = Integer.parseInt(elem.getElementsByTagName("id").item(0).getTextContent());
                    String nickname = elem.getElementsByTagName("nick").item(0).getTextContent();
                    int points = Integer.parseInt(elem.getElementsByTagName("points").item(0).getTextContent());
                    boolean isOnline = Boolean.parseBoolean(elem.getElementsByTagName("isOnline").item(0).getTextContent());

                    Player player = new Player(id, nickname, points, isOnline);
                    players.put(id, player);

                    nextId = Math.max(nextId, id + 1); // Устанавливаем следующий ID
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error loading players", e);
        }
    }

    // Метод для сохранения игроков в XML файл
    private void savePlayers() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element rootElement = doc.createElement("players");
            doc.appendChild(rootElement);

            for (Player player : players.values()) {
                Element playerElement = doc.createElement("player");

                Element idElement = doc.createElement("id");
                idElement.appendChild(doc.createTextNode(String.valueOf(player.getId())));
                playerElement.appendChild(idElement);

                Element nickElement = doc.createElement("nick");
                nickElement.appendChild(doc.createTextNode(player.getNick()));
                playerElement.appendChild(nickElement);

                Element pointsElement = doc.createElement("points");
                pointsElement.appendChild(doc.createTextNode(String.valueOf(player.getPoints())));
                playerElement.appendChild(pointsElement);

                Element isOnlineElement = doc.createElement("isOnline");
                isOnlineElement.appendChild(doc.createTextNode(String.valueOf(player.isOnline())));
                playerElement.appendChild(isOnlineElement);

                rootElement.appendChild(playerElement);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
        } catch (TransformerException | ParserConfigurationException e) {
            throw new RuntimeException("Error saving players", e);
        }
    }
}
