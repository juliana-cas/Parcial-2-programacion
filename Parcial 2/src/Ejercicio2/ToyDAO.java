package Ejercicio2;

import java.util.List;
import Ejercicio2.Toy;

public interface ToyDAO {
    void add(Toy toy);
    Toy get(int id);
    List<Toy> getAll();
    void update(Toy toy);
    void delete(int id);
}