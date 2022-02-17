package com.example.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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


        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> barras = new BarChart<String,Number>(xAxis,yAxis);
        xAxis.setLabel("NºVeces");
        yAxis.setLabel("Pokemon");
        barras.setTitle("Eleccion de pokemons");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("pk1.nombre");
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

        barras.getData().addAll(series1,series2,series3,series4,series5,series6);

    }
}
/*
Pokemon pk1=new Pokemon("Jolteon",200, 200, 65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/135.png"));
    Pokemon pk2=new Pokemon("Charizard",200, 200,45,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png"));
    Pokemon pk3=new Pokemon("Vaporeon",200, 200,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png"));
    Pokemon pk4=new Pokemon("Blastoide",200, 200,65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png"));
    Pokemon pk5=new Pokemon("Mewtwo",200, 200,75,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/150.png"));
    Pokemon pk6=new Pokemon("Butterfree",200, 200,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/012.png"));
* */