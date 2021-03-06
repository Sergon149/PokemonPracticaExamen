package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class HelloController {

    Pokemon pk1=new Pokemon("Jolteon",200, 200, 65,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Jolteon.gif")));
    Pokemon pk2=new Pokemon("Charizard",200, 200,45,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Charizard.gif")));
    Pokemon pk3=new Pokemon("Vaporeon",200, 200,54,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Vaporeon.gif")));
    Pokemon pk4=new Pokemon("Blastoise",200, 200,65,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Blastoise.gif")));
    Pokemon pk5=new Pokemon("Mewtwo",200, 200,75,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Mewtwo.gif")));
    Pokemon pk6=new Pokemon("Butterfree",200, 200,54,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Butterfree.gif")));


    /*static Pokemon pk1=new Pokemon("Jolteon",200, 200, 65,0,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/135.png"));
    static Pokemon pk2=new Pokemon("Charizard",200, 200,45,0,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png"));
    static Pokemon pk3=new Pokemon("Vaporeon",200, 200,54,0,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png"));
    static Pokemon pk4=new Pokemon("Blastoise",200, 200,65,0,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png"));
    static Pokemon pk5=new Pokemon("Mewtwo",200, 200,75,0,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/150.png"));
    static Pokemon pk6=new Pokemon("Butterfree",200, 200,54,0,new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/012.png"));
     */

    ArrayList<Pokemon> pkmalos = new ArrayList<>();

    int num=0;

    static int danototalrecibido =0;
    static int danototalejecutado =0;
    public Estadisticas stats;

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
    ProgressBar barra1;
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
    ProgressBar barra2;
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
    ProgressBar barra3;
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
    ProgressBar barra4;
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
    ProgressBar barra5;
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
    ProgressBar barra6;
    @FXML
    Button boton1;
    @FXML
    Button botonpokedex;
    @FXML
    Button mochila;

    Pokemon selec = null;

    public HelloController() throws FileNotFoundException {
    }
    Ventana2Controller ventana2;
    public void recibecontrolador(Ventana2Controller ventana2){
        this.ventana2=ventana2;
    }


    @FXML
    public void initialize() throws FileNotFoundException {
        nom1.setText(pk1.nombre);
        vida1.setText(pk1.vidaActual+"/"+ pk1.vidaTotal);
        nivel1.setText("NV "+pk1.nivel);
        img1.setImage(pk1.imagen);
        barra1.setProgress((double) pk1.getVidaActual()/pk1.getVidaTotal());
        nom2.setText(pk2.nombre);
        vida2.setText(pk2.vidaActual+"/"+ pk2.vidaTotal);
        nivel2.setText("NV "+pk2.nivel);
        img2.setImage(pk2.imagen);
        barra2.setProgress((double) pk2.getVidaActual()/pk2.getVidaTotal());
        nom3.setText(pk3.nombre);
        vida3.setText(pk3.vidaActual+"/"+ pk3.vidaTotal);
        nivel3.setText("NV "+pk3.nivel);
        img3.setImage(pk3.imagen);
        barra3.setProgress((double) pk3.getVidaActual()/pk3.getVidaTotal());
        nom4.setText(pk4.nombre);
        vida4.setText(pk4.vidaActual+"/"+ pk4.vidaTotal);
        nivel4.setText("NV "+pk4.nivel);
        img4.setImage(pk4.imagen);
        barra4.setProgress((double) pk4.getVidaActual()/pk4.getVidaTotal());
        nom5.setText(pk5.nombre);
        vida5.setText(pk5.vidaActual+"/"+ pk5.vidaTotal);
        nivel5.setText("NV "+pk5.nivel);
        img5.setImage(pk5.imagen);
        barra5.setProgress((double) pk5.getVidaActual()/pk5.getVidaTotal());
        nom6.setText(pk6.nombre);
        vida6.setText(pk6.vidaActual+"/"+ pk6.vidaTotal);
        nivel6.setText("NV "+pk6.nivel);
        img6.setImage(pk6.imagen);
        barra6.setProgress((double) pk6.getVidaActual()/pk6.getVidaTotal());


        if (barra1.getProgress() <= 0.50 && barra1.getProgress() >= 0.25){
            barra1.setStyle("-fx-accent: #f1c905;");
        }
        if (barra1.getProgress() < 0.25){
            barra1.setStyle("-fx-accent: #ff0000;");
        }
        if (barra1.getProgress() > 0.50){
            barra1.setStyle("-fx-accent:  #94ED30;");
        }

        if (barra2.getProgress() <= 0.50 && barra2.getProgress() >= 0.25){
            barra2.setStyle("-fx-accent: #f1c905;");
        }
        if (barra2.getProgress() < 0.25){
            barra2.setStyle("-fx-accent: #ff0000;");
        }
        if (barra2.getProgress() > 0.50){
            barra2.setStyle("-fx-accent:  #94ED30;");
        }

        if (barra3.getProgress() <= 0.50 && barra3.getProgress() >= 0.25){
            barra3.setStyle("-fx-accent: #f1c905;");
        }
        if (barra3.getProgress() < 0.25){
            barra3.setStyle("-fx-accent: #ff0000;");
        }
        if (barra3.getProgress() > 0.50){
            barra3.setStyle("-fx-accent:  #94ED30;");
        }

        if (barra4.getProgress() <= 0.50 && barra4.getProgress() >= 0.25){
            barra4.setStyle("-fx-accent: #f1c905;");
        }
        if (barra4.getProgress() < 0.25){
            barra4.setStyle("-fx-accent: #ff0000;");
        }
        if (barra4.getProgress() > 0.50){
            barra4.setStyle("-fx-accent:  #94ED30;");
        }

        if (barra5.getProgress() <= 0.50 && barra5.getProgress() >= 0.25){
            barra5.setStyle("-fx-accent: #f1c905;");
        }
        if (barra5.getProgress() < 0.25){
            barra5.setStyle("-fx-accent: #ff0000;");
        }
        if (barra5.getProgress() > 0.50){
            barra5.setStyle("-fx-accent:  #94ED30;");
        }

        if (barra6.getProgress() <= 0.50 && barra6.getProgress() >= 0.25){
            barra6.setStyle("-fx-accent: #f1c905;");
        }
        if (barra6.getProgress() < 0.25){
            barra6.setStyle("-fx-accent: #ff0000;");
        }
        if (barra6.getProgress() > 0.50){
            barra6.setStyle("-fx-accent:  #94ED30;");
        }

        pkmalos.add( new Pokemon ("Rayquaza",100, 100, 30,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Rayquaza.gif"))));
        pkmalos.add( new Pokemon ("Pikachu",100, 100,95,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Pikachu.gif"))));
        pkmalos.add( new Pokemon ("Tyranitar",100, 100,45,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Tyranitar.gif"))));
        pkmalos.add( new Pokemon ("Mr. Mine",100, 100,60,0,new Image(new FileInputStream(".\\src\\main\\resources\\Imagenes\\Mr._Mime.gif"))));
    }
    /*
        pkmalos.add( new Pokemon ("Rayquaza",100, 100, 30,0,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/7/78/latest/20140111185443/Rayquaza_XY.gif")));
        pkmalos.add( new Pokemon ("Pikachu",100, 100,95,0,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/7/74/latest/20200104060734/Pikachu_EpEc.gif/111px-Pikachu_EpEc.gif")));
        pkmalos.add( new Pokemon ("Tyranitar",100, 100,45,0,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/5d/latest/20200105034804/Tyranitar_EpEc.gif/88px-Tyranitar_EpEc.gif")));
        pkmalos.add( new Pokemon ("Mr. Mine",100, 100,60,0,new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/3/39/latest/20200104030503/Mr._Mime_EpEc.gif/120px-Mr._Mime_EpEc.gif")));
     */

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
        botonpokedex.setVisible(true);
        mochila.setVisible(true);
    }

    @FXML
    public void actualizarvida(Pokemon pokemon) throws FileNotFoundException {
        selec.setVidaActual(pokemon.getVidaActual());
        initialize();
    }


    @FXML
    protected void onHelloButtonClick() {
        int elecc = (int) (Math.random()*pkmalos.size());
        Pokemon malo = pkmalos.get(elecc);
        try {
            Stage stage2 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));

            BorderPane root =  loader.load();
            Scene scene = new Scene(root, 720, 400);

            stage2.setTitle("PELEA");
            stage2.setScene(scene);
            stage2.show();
            stage2.setResizable(false);

            selec.numveces += 1;
            actualizarStats2();

            Ventana2Controller v2 = loader.getController();
            v2.initialize();
            v2.pasarpk(selec,malo);
            v2.pasarvida(this);
            actualizarvida(selec);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pasargraficas() {

        try {
            Stage stage3 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana3.fxml"));

            AnchorPane root =  loader.load();
            Scene scene = new Scene(root, 720, 400);

            stats=loader.getController();

            stage3.setTitle("GR??FICAS");
            stage3.setScene(scene);
            stage3.show();
            stage3.setResizable(false);

            Estadisticas v3 = loader.getController();
            v3.actualizarquesito();
            v3.pasarcon(this);
            v3.actualizarbarras();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void abrirPokedex(){
        try {

            Stage stage4 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana4.fxml"));

            AnchorPane root =  loader.load();
            Scene scene = new Scene(root, 550, 200);

            stage4.setTitle("INFO");
            stage4.setScene(scene);
            stage4.show();
            stage4.setResizable(false);

            Pokedex v4 = loader.getController();
            v4.pasarpkelegido(selec);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void abrirmochila() throws IOException {
        Stage stage5 = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana5.fxml"));

        AnchorPane root =  loader.load();
        Scene scene = new Scene(root, 300, 550);

        stage5.setTitle("MOCHILA");
        stage5.setScene(scene);
        stage5.show();
        stage5.setResizable(false);

        Mochila v5 = loader.getController();
        v5.pasarmierda(this);
        v5.pasarpkmochila(selec);
    }

    public void actualizarStats1(){
        if (stats != null)
            stats.actualizarquesito();
    }
    public void actualizarStats2(){
        if (stats != null)
            stats.actualizarbarras();
    }
}