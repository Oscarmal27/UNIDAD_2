package sample.Interprete;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;

import static sample.Interprete.TiposToken.*;

public class Compilador {

    private TextArea consola;
    private VBox pane;

    public Compilador(TextArea tx, VBox pane){
        this.consola=tx;
        this.pane=pane;
    }

    public boolean compilar(String renglon){
        String[] arreglo=renglon.split(" ");
        boolean errores=false;
        if(renglon.contains("print")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2);
            consola.appendText("\n"+texto);
        }else if(renglon.contains("declarar")){
            if(!validar(arreglo[1].trim())){
                String tipoToken="";
                if (arreglo[3].equals(buscarToken(tipoToken))){
                    tipoToken=APIO;
                }else{
                    tipoToken=tipoToken;
                }//llave else
                Token token=new Token(tipoToken,arreglo[1].trim());
                arrayToken.add(token);

            }else{
                this.consola.appendText("\n la variable con el nombre "+arreglo[1]+" ya esta declarada");
            }//llave else
        /*}else if (renglon.contains("crear")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            String x=new String(arreglo[3]);
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Lista: \n -"+arreglo[3]+"\n -"+arreglo[4]+"\n -"+arreglo[5]);
                File f=new File("./src/sample/Imagenes/lista.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);*/
        }else if (renglon.contains("llevar")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Llevando los apios");
                File f=new File("./src/sample/Imagenes/llevar.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);
        }else if (renglon.contains("comprar")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Comprando "+texto);
                File f=new File("./src/sample/Imagenes/comprar.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);
        }else if (renglon.contains("partir")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Partiendo "+texto+" para probar");
                File f=new File("./src/sample/Imagenes/partir.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);
        }else if (renglon.contains("oler")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Oliendo "+texto);
                File f=new File("./src/sample/Imagenes/oler.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);
        }else if (renglon.contains("comer")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Comiendo un poco de "+texto);
                File f=new File("./src/sample/Imagenes/comer.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);
        }else if (renglon.contains("golpear")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("Golpeando "+texto+" para saber su madurez \n Si esta maduro(a)");
                File f=new File("./src/sample/Imagenes/golpear.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);
        /*}else if (renglon.contains("vaciar")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.length()-1;
            String texto=renglon.substring(i1,i2).trim();
            if (validar(texto)){
                Token tok1=buscarToken(texto);
                Label label=new Label("vaciando los(as) "+texto+" en el(la)"+texto);
                File f=new File("./src/sample/Imagenes/vaciar.jpg");
                Image imagen=new Image(f.toURI().toString());
                ImageView im= new ImageView();
                im.setImage(imagen);

                pane.getChildren().add(label);
                pane.getChildren().add(im);
            }else{
                this.consola.appendText("\n la fruta o verdura con el nombre "+texto+" no esta declarado");
            }
            this.consola.appendText("\n"+texto);*/
        }
        return errores;
    }//compilar
    public boolean validar(String nombre){
        boolean existe=false;
        for (int x=0;x<arrayToken.size();x++){
            if (arrayToken.get(x).getNombre().equals(nombre)){
                existe=true;
            }
        }//llave for
        return existe;
    }//llave validar
    public Token buscarToken(String nombre){
        Token existe=null;
        for (int x=0;x<arrayToken.size();x++){
            if (arrayToken.get(x).getNombre().equals(nombre)){
                return arrayToken.get(x);
            }
        }//llave for
        return existe;
    }//llave validar
}
