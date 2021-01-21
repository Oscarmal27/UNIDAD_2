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
                if (arreglo[3].equals("Apio")){ tipoToken=APIO;}else if (arreglo[3].equals("Acelga")) { tipoToken = ACELGA;
                }else if (arreglo[3].equals("Agucate")) { tipoToken = AGUACATE; }else if (arreglo[3].equals("Ajo")) { tipoToken = AJO;
                }else if (arreglo[3].equals("Perejil")) { tipoToken = PEREJIL; }else if (arreglo[3].equals("Albaricoque")) { tipoToken = ALBARICOQUE;
                }else if (arreglo[3].equals("Alcachofa")) { tipoToken = ALCACHOFA; }else if (arreglo[3].equals("Almendra")) { tipoToken = ALMENDRA;
                }else if (arreglo[3].equals("Arandano")) { tipoToken = ARANDANO; }else if (arreglo[3].equals("Avellana")) { tipoToken = AVELLANA;
                }else if (arreglo[3].equals("Berenjena")) { tipoToken = BERENJENA; }else if (arreglo[3].equals("Brocoli")) { tipoToken = BROCOLI;
                }else if (arreglo[3].equals("Cacahuate")) { tipoToken = CACAHUATE; }else if (arreglo[3].equals("Calabacin")) { tipoToken = CALABACIN;
                }else if (arreglo[3].equals("Calabaza")) { tipoToken = CALABAZA; }else if (arreglo[3].equals("Cebolla")) { tipoToken = CEBOLLA;
                }else if (arreglo[3].equals("Cereza")) { tipoToken = CEREZA; }else if (arreglo[3].equals("Champiñon")) { tipoToken = CHAMPINON;
                }else if (arreglo[3].equals("Ciruela")) { tipoToken = CIRUELA; }else if (arreglo[3].equals("Coco")) { tipoToken = COCO;
                }else if (arreglo[3].equals("Col")) { tipoToken = COL; }else if (arreglo[3].equals("Coliflor")) { tipoToken = COLIFLOR;
                }else if (arreglo[3].equals("Esparrago")) { tipoToken = ESPARRAGO; }else if (arreglo[3].equals("Espinaca")) { tipoToken = ESPINACA;
                }else if (arreglo[3].equals("Frambuesa")) { tipoToken = FRAMBUESA; }else if (arreglo[3].equals("Fresa")) { tipoToken = FRESA;
                }else if (arreglo[3].equals("Grosella")) { tipoToken = GROSELLA; }else if (arreglo[3].equals("Guisante")) { tipoToken = GUISANTE;
                }else if (arreglo[3].equals("Haba")) { tipoToken = HABA; }else if (arreglo[3].equals("Higo")) { tipoToken = HIGO;
                }else if (arreglo[3].equals("Judia Verde")) { tipoToken = JUDIAVERDE; }else if (arreglo[3].equals("Kiwi")) { tipoToken = KIWI;
                }else if (arreglo[3].equals("Lechuga")) { tipoToken = LECHUGA; }else if (arreglo[3].equals("Limon")) { tipoToken = LIMON;
                }else if (arreglo[3].equals("Maiz")) { tipoToken = MAIZ; }else if (arreglo[3].equals("Mandarina")) { tipoToken = MANDARINA;
                }else if (arreglo[3].equals("Mango")) { tipoToken = MANGO; }else if (arreglo[3].equals("Manzana")) { tipoToken = MANZANA;
                }else if (arreglo[3].equals("Melon")) { tipoToken = MELON; }else if (arreglo[3].equals("Naranja")) { tipoToken = NARANJA;
                }else if (arreglo[3].equals("Nuez")) { tipoToken = NUEZ; }else if (arreglo[3].equals("Papaya")) { tipoToken = PAPAYA;
                }else if (arreglo[3].equals("Patata")) { tipoToken = PATATA; }else if (arreglo[3].equals("Pepino")) { tipoToken = PEPINO;
                }else if (arreglo[3].equals("Pera")) { tipoToken = PERA; }else if (arreglo[3].equals("Pimiento")) { tipoToken = PIMIENTO;
                }else if (arreglo[3].equals("Pina")) { tipoToken = PINA; }else if (arreglo[3].equals("Pistacho")) { tipoToken = PISTACHO;
                }else if (arreglo[3].equals("Platano")) { tipoToken = PLATANO; }else if (arreglo[3].equals("Puerro")) { tipoToken = PUERRO;
                }else if (arreglo[3].equals("Rabano")) { tipoToken = RABANO; }else if (arreglo[3].equals("Remolacha")) { tipoToken = REMOLACHA;
                }else if (arreglo[3].equals("Sandia")) { tipoToken = SANDIA; }else if (arreglo[3].equals("Tomate")) { tipoToken = TOMATE;
                }else if (arreglo[3].equals("Uva")) { tipoToken = UVA; }else if (arreglo[3].equals("Zanahoria")) { tipoToken = ZANAHORIA;
                }else if (arreglo[3].equals("Zarzamora")) { tipoToken = ZARZAMORA;
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
                Label label=new Label("Llevando el(la) "+tok1.getTipo());
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
                Label label=new Label("Comprando el(la) "+tok1.getTipo());
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
                Label label=new Label("Partiendo el(la) "+tok1.getTipo()+" para probar");
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
                Label label=new Label("Oliendo el(la) "+tok1.getTipo());
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
                Label label=new Label("Comiendo un poco de el(la) "+tok1.getTipo());
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
                Label label=new Label("Golpeando el(la) "+tok1.getTipo()+" para saber su madurez \n Si esta maduro(a)");
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
