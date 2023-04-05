package org.example;

import com.github.javafaker.Faker;
import manager.ConnectorManager;
import org.electrolinera.model.Connector;
import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class TestConnectorManager {

    ConnectorManager connectorManager = new ConnectorManager();

    public void initDataFaker() {

        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
            connectorManager. connectorList.add(
                    new Connector(faker.idNumber().hashCode(), faker.name().name(), faker.number().numberBetween(1, 3), faker.country().name(), faker.number().numberBetween(1000, 9999), faker.address().city(), faker.address().streetName(), faker.number().numberBetween(1, 100)));
        }

        // connectorList.add(new Connector(1, "Connector 1", 1, "France", 75000, "Paris", "Rue de la Paix", 1));


    }
    public ConnectorManager addData() throws ParseException {

        ConnectorManager connectorManager = new ConnectorManager();

        connectorManager.connectorList.add(new Connector(1, "Connector 1", 1, "Spain", 08800, "Barcelona", "Carrer Gran Via", 1));
        connectorManager.connectorList.add(new Connector(2, "Connector 2", 2, "France", 75000, "Paris", "Rue de la Paix", 1));
        connectorManager.connectorList.add(new Connector(3, "Connector 3", 3, "France", 75000, "Paris", "Rue de la Paix", 1));
        connectorManager.connectorList.add(new Connector(4, "Connector 4", 1, "France", 75000, "Paris", "Rue de la Paix", 1));

        return connectorManager;
    }

    @Test
    public void testAddConnector() throws ParseException {

        Connector connector = new Connector(1, "Connector 1", 1, "Spain", 08800, "Barcelona", "Carrer Gran Via", 1);

        ConnectorManager connectorManager = new ConnectorManager();
        connectorManager.addConnector(connector);

        connectorManager.addConnector(connector);

        assertEquals(connectorManager.getConnector(index:0),
        new Connector(1, "Connector 1", 1, "Spain", 08800, "Barcelona", "Carrer Gran Via", 1));
    }

    @Test
    public void testGetConnector() throws ParseException {

        ConnectorManager connectorManager = addData();

        assertEquals(connectorManager.getConnector(index:0),
        new Connector(1, "Connector 1", 1, "Spain", 08800, "Barcelona", "Carrer Gran Via", 1));
    }
    //  @Test
    //    public void  GetAllReservationByDateTest2() throws ParseException {

}
