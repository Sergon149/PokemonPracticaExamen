package com.example.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

import static com.example.pokemon.HelloController.*;

public class Estadisticas {
    @FXML
    PieChart quesito;
    @FXML
    BarChart barras;

      HelloController ventana1;

    public void actualizarquesito() {

        quesito.setTitle("Daño entre Pokemons");

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Dano ejecutado: "+danototalejecutado, danototalejecutado),
                new PieChart.Data("Dano recibido: "+danototalrecibido, danototalrecibido)
        );
        quesito.setData(pieChartData);
        quesito.autosize();
    }


    public void actualizarbarras() {


        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();

        if (barras.getData().isEmpty()){
            xAxis.setLabel("NºVeces");
            yAxis.setLabel("Pokemon");
            barras.setTitle("Eleccion de pokemons");

            XYChart.Series series1 = new XYChart.Series();
            series1.setName(ventana1.pk1.nombre);
            series1.getData().add(new XYChart.Data(ventana1.pk1.nombre, ventana1.pk1.numveces));

            XYChart.Series series2 = new XYChart.Series();
            series2.setName(ventana1.pk2.nombre);
            series2.getData().add(new XYChart.Data(ventana1.pk2.nombre, ventana1.pk2.numveces));

            XYChart.Series series3 = new XYChart.Series();
            series3.setName(ventana1.pk3.nombre);
            series3.getData().add(new XYChart.Data(ventana1.pk3.nombre, ventana1.pk3.numveces));

            XYChart.Series series4 = new XYChart.Series();
            series4.setName(ventana1.pk4.nombre);
            series4.getData().add(new XYChart.Data(ventana1.pk4.nombre, ventana1.pk4.numveces));

            XYChart.Series series5 = new XYChart.Series();
            series5.setName(ventana1.pk5.nombre);
            series5.getData().add(new XYChart.Data(ventana1.pk5.nombre, ventana1.pk5.numveces));

            XYChart.Series series6 = new XYChart.Series();
            series6.setName(ventana1.pk6.nombre);
            series6.getData().add(new XYChart.Data(ventana1.pk6.nombre, ventana1.pk6.numveces));

            barras.setAnimated(false);

            barras.getData().addAll(series1,series2,series3,series4,series5,series6);
        }else{

            XYChart.Series series1 = new XYChart.Series();
            series1.setName(ventana1.pk1.nombre);
            series1.getData().add(new XYChart.Data(ventana1.pk1.nombre, ventana1.pk1.numveces));

            XYChart.Series series2 = new XYChart.Series();
            series2.setName(ventana1.pk2.nombre);
            series2.getData().add(new XYChart.Data(ventana1.pk2.nombre, ventana1.pk2.numveces));

            XYChart.Series series3 = new XYChart.Series();
            series3.setName(ventana1.pk3.nombre);
            series3.getData().add(new XYChart.Data(ventana1.pk3.nombre, ventana1.pk3.numveces));

            XYChart.Series series4 = new XYChart.Series();
            series4.setName(ventana1.pk4.nombre);
            series4.getData().add(new XYChart.Data(ventana1.pk4.nombre, ventana1.pk4.numveces));

            XYChart.Series series5 = new XYChart.Series();
            series5.setName(ventana1.pk5.nombre);
            series5.getData().add(new XYChart.Data(ventana1.pk5.nombre, ventana1.pk5.numveces));

            XYChart.Series series6 = new XYChart.Series();
            series6.setName(ventana1.pk6.nombre);
            series6.getData().add(new XYChart.Data(ventana1.pk6.nombre, ventana1.pk6.numveces));


            BarChart bc = new BarChart(xAxis,yAxis);
            bc.getData().addAll(series1,series2,series3,series4,series5,series6);


            barras.setData(bc.getData());

        }



    }
}
