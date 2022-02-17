package com.example.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class Estadisticas {
    @FXML
    PieChart quesito;
    @FXML
    BarChart barras;


    public void generarquesito(int danototalejecutado, int danototalrecibido) {

        quesito.setTitle("Daño entre Pokemons");
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Dano ejecutado: "+danototalejecutado, danototalejecutado),
                new PieChart.Data("Dano recibido: "+danototalrecibido, danototalrecibido)
        );
        quesito.setLabelLineLength(30);
        quesito.setData(pieChartData);
    }


    public void generarbarras(Pokemon pk1, Pokemon pk2, Pokemon pk3, Pokemon pk4, Pokemon pk5, Pokemon pk6, int contpk1, int contpk2, int contpk3, int contpk4, int contpk5, int contpk6) {

        barras.setTitle("Eleccion de pokemons");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        xAxis.setLabel("NºVeces");
        yAxis.setLabel("Pokemon");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName(pk1.nombre);
        series1.getData().add(new XYChart.Data(pk1.nombre, contpk1));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName(pk2.nombre);
        series2.getData().add(new XYChart.Data(pk2.nombre, contpk2));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName(pk3.nombre);
        series3.getData().add(new XYChart.Data(pk3.nombre, contpk3));

        XYChart.Series series4 = new XYChart.Series();
        series4.setName(pk4.nombre);
        series4.getData().add(new XYChart.Data(pk4.nombre, contpk4));

        XYChart.Series series5 = new XYChart.Series();
        series5.setName(pk5.nombre);
        series5.getData().add(new XYChart.Data(pk5.nombre, contpk5));

        XYChart.Series series6 = new XYChart.Series();
        series6.setName(pk6.nombre);
        series6.getData().add(new XYChart.Data(pk6.nombre, contpk6));

        bc.getData().addAll(series1,series2,series3,series4,series5,series6);

    }
}
/*

* */