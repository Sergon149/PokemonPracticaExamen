package com.example.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.*;

import static com.example.pokemon.HelloController.*;

public class Estadisticas {
    @FXML
    PieChart quesito;
    @FXML
    BarChart barras;


    public void actualizarquesito() {

        quesito.setTitle("Daño entre Pokemons");
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Dano ejecutado: "+danototalejecutado, danototalejecutado),
                new PieChart.Data("Dano recibido: "+danototalrecibido, danototalrecibido)
        );
        //quesito.setLabelLineLength(50);
        quesito.setData(pieChartData);
        quesito.autosize();
    }


    public void actualizarbarras() {

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("NºVeces");
        yAxis.setLabel("Pokemon");
        yAxis.applyCss();
        barras.setTitle("Eleccion de pokemons");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName(pk1.nombre);
        series1.getData().add(new XYChart.Data(pk1.nombre, pk1.numveces));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName(pk2.nombre);
        series2.getData().add(new XYChart.Data(pk2.nombre, pk2.numveces));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName(pk3.nombre);
        series3.getData().add(new XYChart.Data(pk3.nombre, pk3.numveces));

        XYChart.Series series4 = new XYChart.Series();
        series4.setName(pk4.nombre);
        series4.getData().add(new XYChart.Data(pk4.nombre, pk4.numveces));

        XYChart.Series series5 = new XYChart.Series();
        series5.setName(pk5.nombre);
        series5.getData().add(new XYChart.Data(pk5.nombre, pk5.numveces));

        XYChart.Series series6 = new XYChart.Series();
        series6.setName(pk6.nombre);
        series6.getData().add(new XYChart.Data(pk6.nombre, pk6.numveces));

        barras.setAnimated(false);

        barras.getData().addAll(series1,series2,series3,series4,series5,series6);

    }
}
