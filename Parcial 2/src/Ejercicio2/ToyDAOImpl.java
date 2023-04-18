package Ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import Ejercicio2.ToyDAO;
import  Ejercicio2.Toy;
public class ToyDAOImpl implements ToyDAO {
    private List<Toy> toys = new ArrayList<>();
    private File file = new File("toys.ser");

    public ToyDAOImpl() {
        if (file.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                toys = (List<Toy>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void add(Toy toy) {
        toys.add(toy);
        saveToFile();
    }

    @Override
    public Toy get(int id) {
        return toys.stream()
                .filter(toy -> toy.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Toy> getAll() {
        return new ArrayList<>(toys);
    }

    @Override
    public void update(Toy toy) {
        Toy toyToUpdate = get(toy.getId());
        if (toyToUpdate != null) {
            toyToUpdate.setName(toy.getName());
            toyToUpdate.setCategory(toy.getCategory());
            toyToUpdate.setPrice(toy.getPrice());
            toyToUpdate.setQuantity(toy.getQuantity());
            saveToFile();
        }
    }

    @Override
    public void delete(int id) {
        toys.removeIf(toy -> toy.getId() == id);
        saveToFile();
    }

    private void saveToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(toys);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}