package nl.avans.drivio.controller;

public interface ICrudController {
    public void create(Object data);
    public void readAll();
    public void read(Object id);
    public void update (Object id, Object data);
    public void delete (Object id);
}
