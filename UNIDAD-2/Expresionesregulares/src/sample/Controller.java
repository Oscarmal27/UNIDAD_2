package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    @FXML TextField txtTexto;
    @FXML ListView listaEjer;
    @FXML Label lblResultado;

    @FXML protected void initialize(){
        //ISC-3B
        //frase casa_perro
        listaEjer.getItems().addAll("Ejercicio 1", "Ejercicio 2", "Validar Grupo","Palabra con guión bajo",
                "No empiece con db-","Termina con count","2 nombres", "MAC Address","Comience en Mayúscula y termine en Minúscula",
                "Número Binario de 8 dígitos","Hexadecimal", "Operación de 1 dígito","Número de control (ITSNCG)","CURP",
                "Cantidad de pesos", "No de tarjeta de crédito", "Etiqueta HTML", "Color Hexadecimal","Link", "Query Insert into de SQL",
                "Sentencia if", "Frase con salto de linea", "Url con un video de youtube");
    }
    public void procesar(ActionEvent event){
        int seleccion=listaEjer.getSelectionModel().getSelectedIndex();
        String texto = txtTexto.getText();
        String expresion ="";
        switch (seleccion){
            case 0:{ expresion ="^[_][^p]([a-zA-Z0-9]{3,})[q|w]$";
                break; }
            case 1:{ expresion="\\\\n([a-zA-Z]+)";
                break;}
            case 2:{ expresion="^(ISC)-([1-9])[A|B]$";
                break;}
            case 3:{ expresion="([A-Za-z]{1,})[_]([A-Za-z]{1,})";
                break;}
            case 4:{ expresion="^[^db-][A-Za-z]{1,}$";
                break;}
            case 5:{ expresion="[A-Za-z]{1,}[count]$";
                break;}
            case 6:{ expresion="^[A-Z]([a-z]{1,})[ ][A-Z]([a-z]{1,})";
                break;}
            case 7:{ expresion="(([A-Fa-f0-9]{2})[-|:]([A-Fa-f0-9]{2})[-|:]([A-Fa-f0-9]{2})[-|:]([A-Fa-f0-9]{2})[-|:]([A-Fa-f0-9]{2})[-|:]([A-Fa-f0-9]{2}))|" +
                    "([A-Fa-f0-9]{4})[.]([A-Fa-f0-9]{4})[.]([A-Fa-f0-9]{4})";
                break;}
            case 8:{ expresion="^[A-Z]([a-z]{1,})[a-z]$";
                break;}
            case 9:{ expresion="[0-1]{8}";
                break;}
            case 10:{ expresion="[A-Fa-f0-9]{1,}";
                break;}
            case 11:{ expresion="^[0-9]([+]|[-]|[/]|[*])[0-9]$";
                break;}
            case 12:{ expresion="^([0-9]{2})([C]|[c])([G]|[g])([0-9]{4})$";
                break;}
            case 13:{
                expresion="^([A-Z]{4})([0-9]{6})[H|M]([A-Z]{5})[0-9A-Z][0-9]$";
                break;}
            case 14: {
                expresion="^[$]([0-9]{1,})[.]([0-9]{2})$";
            break;}
            case 15: {
                expresion="^([0-9]{4})[ ]([0-9]{4})[ ]([0-9]{4})[ ]([0-9]{4})$";
                break;}
            case 16: {
                expresion="^[<]([A-Za-z]{1,})[>]([A-Za-z]{1,}|[A-Za-z0-9]{1,})[<][/]([A-Za-z]{1,})[>]$";
                break;}
            case 17: {
                expresion="([0-9]{6})|([A-F0-9]{6})";
                break;}
            case 18: {
                expresion="^https://www[.]([A-Za-z]{1,}|[A-Za-z0-9]{1,})[.]com$";
                break;}
            case 19: {
                expresion="^INSERT INTO ([A-Z]{1,}|[A-Z0-9]{1,})[(]([A-Z]{1,}|[A-Z0-9]{1,})[) ]VALUES[(]([A-Z]{1,}|[A-Z0-9]{1,})[)]";// NO PUDE LOGRAR HACERLA
                break;}
            case 20: {
                expresion="^if[(]([a-z]{1,})([<]|[=]|[>])(([=]|[a-z]{1,})|([=][a-z]{1,}))[)][{]";
                break;}
            case 21: {
                expresion="([A-Za-z]{1,})[\n][A-Za-z]{1,}";// NO PUDE LOGRAR HACERLA
                break;}
            case 22: {
                expresion="^https://www[.]youtube[.]com/watch[?]v=([A-Za-z0-9]{1,})";
                break;}
        }
        Pattern patron=Pattern.compile(expresion);
        Matcher matcher=patron.matcher(texto);
        if(matcher.matches()){
            lblResultado.setText("SI CUMPLE");
        }else{
            lblResultado.setText("NO CUMPLE");
        }//llave else
    }



}
