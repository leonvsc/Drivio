package nl.avans.drivio.data;

public interface ICrudData {
    public void getAll();
    public void getById(Object id);
    public void create (Object id);
    public void update (Object id, Object data);
    public void delete (Object id);
    public void dataToModel(Object object); // TODO: Checken of dit klopt.
}
