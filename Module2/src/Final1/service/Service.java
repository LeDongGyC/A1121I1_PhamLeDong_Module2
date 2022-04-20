package Final1.service;

import Final1.util.NotFoundProductException;

public interface Service {
    void addNew();
    void display();
    void delete() throws NotFoundProductException;
    void search();
}
