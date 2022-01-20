package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloController {

    Pokemon pk1=new Pokemon("Jolteon",204, 204, 65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/135.png"));
    Pokemon pk2=new Pokemon("Charizard",148, 148,45,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png"));
    Pokemon pk3=new Pokemon("Vaporeon",234, 234,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png"));
    Pokemon pk4=new Pokemon("Blastoide",222, 222,65,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png"));
    Pokemon pk5=new Pokemon("Mewtwo",298, 298,75,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/150.png"));
    Pokemon pk6=new Pokemon("Butterfree",160, 160,54,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/012.png"));


    int num;

    @FXML
    AnchorPane caja1;
    @FXML
    Label nom1;
    @FXML
    Label vida1;
    @FXML
    Label nivel1;
    @FXML
    ImageView img1;
    @FXML
    AnchorPane caja2;
    @FXML
    Label nom2;
    @FXML
    Label vida2;
    @FXML
    Label nivel2;
    @FXML
    ImageView img2;
    @FXML
    AnchorPane caja3;
    @FXML
    Label nom3;
    @FXML
    Label vida3;
    @FXML
    Label nivel3;
    @FXML
    ImageView img3;
    @FXML
    AnchorPane caja4;
    @FXML
    Label nom4;
    @FXML
    Label vida4;
    @FXML
    Label nivel4;
    @FXML
    ImageView img4;
    @FXML
    AnchorPane caja5;
    @FXML
    Label nom5;
    @FXML
    Label vida5;
    @FXML
    Label nivel5;
    @FXML
    ImageView img5;
    @FXML
    AnchorPane caja6;
    @FXML
    Label nom6;
    @FXML
    Label vida6;
    @FXML
    Label nivel6;
    @FXML
    ImageView img6;
    @FXML
    Button boton1;

    Pokemon selec = null;

    @FXML
    public void initialize(){
        nom1.setText(pk1.nombre);
        vida1.setText(pk1.vidaActual+"/"+ pk1.vidaTotal);
        nivel1.setText("NV "+pk1.nivel);
        img1.setImage(pk1.imagen);
        nom2.setText(pk2.nombre);
        vida2.setText(pk2.vidaActual+"/"+ pk2.vidaTotal);
        nivel2.setText("NV "+pk2.nivel);
        img2.setImage(pk2.imagen);
        nom3.setText(pk3.nombre);
        vida3.setText(pk3.vidaActual+"/"+ pk3.vidaTotal);
        nivel3.setText("NV "+pk3.nivel);
        img3.setImage(pk3.imagen);
        nom4.setText(pk4.nombre);
        vida4.setText(pk4.vidaActual+"/"+ pk4.vidaTotal);
        nivel4.setText("NV "+pk4.nivel);
        img4.setImage(pk4.imagen);
        nom5.setText(pk5.nombre);
        vida5.setText(pk5.vidaActual+"/"+ pk5.vidaTotal);
        nivel5.setText("NV "+pk5.nivel);
        img5.setImage(pk5.imagen);
        nom6.setText(pk6.nombre);
        vida6.setText(pk6.vidaActual+"/"+ pk6.vidaTotal);
        nivel6.setText("NV "+pk6.nivel);
        img6.setImage(pk6.imagen);

    }



    @FXML
    private void click1(){
        clickboton();
        selec=pk1;
        num=1;
        System.out.println("Caja1 pulsada");
        nom1.setStyle("-fx-text-fill: #0BE1F0;");
        vida1.setStyle("-fx-text-fill: #0BE1F0;");
        nivel1.setStyle("-fx-text-fill: #0BE1F0;");
        nom2.setStyle("-fx-text-fill: #f8f7f7;");
        vida2.setStyle("-fx-text-fill: #f8f7f7;");
        nivel2.setStyle("-fx-text-fill: #f8f7f7;");
        nom3.setStyle("-fx-text-fill: #f8f7f7;");
        vida3.setStyle("-fx-text-fill: #f8f7f7;");
        nivel3.setStyle("-fx-text-fill: #f8f7f7;");
        nom4.setStyle("-fx-text-fill: #f8f7f7;");
        vida4.setStyle("-fx-text-fill: #f8f7f7;");
        nivel4.setStyle("-fx-text-fill: #f8f7f7;");
        nom5.setStyle("-fx-text-fill: #f8f7f7;");
        vida5.setStyle("-fx-text-fill: #f8f7f7;");
        nivel5.setStyle("-fx-text-fill: #f8f7f7;");
        nom6.setStyle("-fx-text-fill: #f8f7f7;");
        vida6.setStyle("-fx-text-fill: #f8f7f7;");
        nivel6.setStyle("-fx-text-fill: #f8f7f7;");
    }
    @FXML
    private void click2(){
        clickboton();
        num=2;
        selec=pk2;
        System.out.println("Caja2 pulsada");
        nom1.setStyle("-fx-text-fill: #f8f7f7;");
        vida1.setStyle("-fx-text-fill: #f8f7f7;");
        nivel1.setStyle("-fx-text-fill: #f8f7f7;");
        nom2.setStyle("-fx-text-fill: #0BE1F0;");
        vida2.setStyle("-fx-text-fill: #0BE1F0;");
        nivel2.setStyle("-fx-text-fill: #0BE1F0;");
        nom3.setStyle("-fx-text-fill: #f8f7f7;");
        vida3.setStyle("-fx-text-fill: #f8f7f7;");
        nivel3.setStyle("-fx-text-fill: #f8f7f7;");
        nom4.setStyle("-fx-text-fill: #f8f7f7;");
        vida4.setStyle("-fx-text-fill: #f8f7f7;");
        nivel4.setStyle("-fx-text-fill: #f8f7f7;");
        nom5.setStyle("-fx-text-fill: #f8f7f7;");
        vida5.setStyle("-fx-text-fill: #f8f7f7;");
        nivel5.setStyle("-fx-text-fill: #f8f7f7;");
        nom6.setStyle("-fx-text-fill: #f8f7f7;");
        vida6.setStyle("-fx-text-fill: #f8f7f7;");
        nivel6.setStyle("-fx-text-fill: #f8f7f7;");
    }
    @FXML
    private void click3(){
        clickboton();
        num=3;
        selec=pk3;
        System.out.println("Caja3 pulsada");
        nom1.setStyle("-fx-text-fill: #f8f7f7;");
        vida1.setStyle("-fx-text-fill: #f8f7f7;");
        nivel1.setStyle("-fx-text-fill: #f8f7f7;");
        nom2.setStyle("-fx-text-fill: #f8f7f7;");
        vida2.setStyle("-fx-text-fill: #f8f7f7;");
        nivel2.setStyle("-fx-text-fill: #f8f7f7;");
        nom3.setStyle("-fx-text-fill: #0BE1F0;");
        vida3.setStyle("-fx-text-fill: #0BE1F0;");
        nivel3.setStyle("-fx-text-fill: #0BE1F0;");
        nom4.setStyle("-fx-text-fill: #f8f7f7;");
        vida4.setStyle("-fx-text-fill: #f8f7f7;");
        nivel4.setStyle("-fx-text-fill: #f8f7f7;");
        nom5.setStyle("-fx-text-fill: #f8f7f7;");
        vida5.setStyle("-fx-text-fill: #f8f7f7;");
        nivel5.setStyle("-fx-text-fill: #f8f7f7;");
        nom6.setStyle("-fx-text-fill: #f8f7f7;");
        vida6.setStyle("-fx-text-fill: #f8f7f7;");
        nivel6.setStyle("-fx-text-fill: #f8f7f7;");
    }
    @FXML
    private void click4(){
        clickboton();
        num=4;
        selec=pk4;
        System.out.println("Caja4 pulsada");
        nom1.setStyle("-fx-text-fill: #f8f7f7;");
        vida1.setStyle("-fx-text-fill: #f8f7f7;");
        nivel1.setStyle("-fx-text-fill: #f8f7f7;");
        nom2.setStyle("-fx-text-fill: #f8f7f7;");
        vida2.setStyle("-fx-text-fill: #f8f7f7;");
        nivel2.setStyle("-fx-text-fill: #f8f7f7;");
        nom3.setStyle("-fx-text-fill: #f8f7f7;");
        vida3.setStyle("-fx-text-fill: #f8f7f7;");
        nivel3.setStyle("-fx-text-fill: #f8f7f7;");
        nom4.setStyle("-fx-text-fill: #0BE1F0;");
        vida4.setStyle("-fx-text-fill: #0BE1F0;");
        nivel4.setStyle("-fx-text-fill: #0BE1F0;");
        nom5.setStyle("-fx-text-fill: #f8f7f7;");
        vida5.setStyle("-fx-text-fill: #f8f7f7;");
        nivel5.setStyle("-fx-text-fill: #f8f7f7;");
        nom6.setStyle("-fx-text-fill: #f8f7f7;");
        vida6.setStyle("-fx-text-fill: #f8f7f7;");
        nivel6.setStyle("-fx-text-fill: #f8f7f7;");
    }
    @FXML
    private void click5(){
        clickboton();
        num=5;
        selec=pk5;
        System.out.println("Caja5 pulsada");
        nom1.setStyle("-fx-text-fill: #f8f7f7;");
        vida1.setStyle("-fx-text-fill: #f8f7f7;");
        nivel1.setStyle("-fx-text-fill: #f8f7f7;");
        nom2.setStyle("-fx-text-fill: #f8f7f7;");
        vida2.setStyle("-fx-text-fill: #f8f7f7;");
        nivel2.setStyle("-fx-text-fill: #f8f7f7;");
        nom3.setStyle("-fx-text-fill: #f8f7f7;");
        vida3.setStyle("-fx-text-fill: #f8f7f7;");
        nivel3.setStyle("-fx-text-fill: #f8f7f7;");
        nom4.setStyle("-fx-text-fill: #f8f7f7;");
        vida4.setStyle("-fx-text-fill: #f8f7f7;");
        nivel4.setStyle("-fx-text-fill: #f8f7f7;");
        nom5.setStyle("-fx-text-fill: #0BE1F0;");
        vida5.setStyle("-fx-text-fill: #0BE1F0;");
        nivel5.setStyle("-fx-text-fill: #0BE1F0;");
        nom6.setStyle("-fx-text-fill: #f8f7f7;");
        vida6.setStyle("-fx-text-fill: #f8f7f7;");
        nivel6.setStyle("-fx-text-fill: #f8f7f7;");
    }
    @FXML
    private void click6(){
        clickboton();
        num=6;
        selec=pk6;
        System.out.println("Caja6 pulsada");
        nom1.setStyle("-fx-text-fill: #f8f7f7;");
        vida1.setStyle("-fx-text-fill: #f8f7f7;");
        nivel1.setStyle("-fx-text-fill: #f8f7f7;");
        nom2.setStyle("-fx-text-fill: #f8f7f7;");
        vida2.setStyle("-fx-text-fill: #f8f7f7;");
        nivel2.setStyle("-fx-text-fill: #f8f7f7;");
        nom3.setStyle("-fx-text-fill: #f8f7f7;");
        vida3.setStyle("-fx-text-fill: #f8f7f7;");
        nivel3.setStyle("-fx-text-fill: #f8f7f7;");
        nom4.setStyle("-fx-text-fill: #f8f7f7;");
        vida4.setStyle("-fx-text-fill: #f8f7f7;");
        nivel4.setStyle("-fx-text-fill: #f8f7f7;");
        nom5.setStyle("-fx-text-fill: #f8f7f7;");
        vida5.setStyle("-fx-text-fill: #f8f7f7;");
        nivel5.setStyle("-fx-text-fill: #f8f7f7;");
        nom6.setStyle("-fx-text-fill: #0BE1F0;");
        vida6.setStyle("-fx-text-fill: #0BE1F0;");
        nivel6.setStyle("-fx-text-fill: #0BE1F0;");
    }

    @FXML
    public void clickboton(){
            boton1.setVisible(true);

    }

    @FXML
    protected void onHelloButtonClick() {
        try {
            Stage stage2 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));

            BorderPane root =  loader.load();
            Scene scene = new Scene(root, 720, 400);

            stage2.setTitle("PELEA");
            stage2.setScene(scene);
            stage2.show();
            stage2.setResizable(false);

            Ventana2Controller v = loader.getController();
            v.initialize();
            v.pasarpk(selec);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

class Pokemon{
    String nombre=" ";
    float vidaActual=0;
    float vidaTotal=0;
    int nivel=0;
    Image imagen;

    public Pokemon(String nombre, float vidaActual, float vidaTotal, int nivel, Image imagen) {
        this.nombre = nombre;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.nivel = nivel;
        this.imagen = imagen;
    }
}