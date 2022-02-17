package com.example.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class Estadisticas {
    @FXML
    PieChart quesito;


    public void generarquesito(int danototalejecutado, int danototalrecibido) {

        quesito.setTitle("Daño entre Pokemons");
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Dano ejecutado: "+danototalejecutado, danototalejecutado),
                new PieChart.Data("Dano recibido: "+danototalrecibido, danototalrecibido)
        );
        quesito.setLabelLineLength(30);
        quesito.setData(pieChartData);
    }
}
