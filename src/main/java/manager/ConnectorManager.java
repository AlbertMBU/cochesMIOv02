package manager;

import model.Connector;
import org.electrolinera.model.Connector;
import java.util.ArrayList;
import java.util.List;


public class ConnectorManager{

    public Connector connector = new Connector();
    public List<Connector> connectorList = new ArrayList<Connector>();

    public void AddConnector(int idConnector, string name, int type, string country, int CodePostal, string city, string street, int streetNumber){
        connector.setIdConnector(idConnector);
        connector.setName(name);
        connector.setType(type);
        connector.setCountry(country);
        connector.setCodePostal(CodePostal);
        connector.setCity(city);
        connector.setStreet(street);
        connector.setStreetNumber(streetNumber);
        connectorList.add(connector);
    }
    public boolean ExistConnector(Connector connector)
    {
        return false;
    }
}
