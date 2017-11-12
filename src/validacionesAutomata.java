
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shepe
 */
public class validacionesAutomata {
    int nErrores=0, cToken=1;
    void analizarLxL(JTextArea txtAutomata,JTextArea txtErrores,JTextArea tokenArea,String exp) {
        String lin[]=exp.split("\n");
        txtAutomata.setText("");
        txtErrores.setText("");
        tokenArea.setText("");
        cToken=1;
        for(int i=0;i<lin.length;i++){
            //txtRes.setText(txtRes.getText()+"En la línea "+i+" tenemos "+lin[i]+"\n");
            validar(lin[i],txtAutomata,txtErrores,tokenArea,i);
        }
        if(nErrores!=0){
            txtErrores.setText(txtErrores.getText()+"\n\nEl código se ejecutó con errores");
        }else{
            txtErrores.setText(txtErrores.getText()+"\n\nEl código se ejecutó sin errores");
        }
        /*
        if(validarAutomata(car,txtRes, car.length)){
            txtRes.setText(txtRes.getText()+"\nLa expresión es válida");
        }else{
            txtRes.setText(txtRes.getText()+"\nLa expresión es inválida");
        }*/
        
    }
    
    private void validar(String lin, JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, int nLin) {
        if(!lin.substring(lin.length()-1,lin.length()).equals(";")){
            txtErrores.setText(txtErrores.getText()+"\nError: Se esperba un ; en la línea "+nLin+" columna "+lin.length());
            nErrores++;
            return;
        }
        String token[]=lin.replace(";", " ;").split(" ");
        
        if(!validarAutomata(token,txtAutomata,txtErrores,tokenArea, token.length,nLin,lin)){
            nErrores++;
        }
    }

    private Boolean validarAutomata(String[] token, JTextArea txtAutomata,JTextArea txtErrores,JTextArea tokenArea,int tam,int nLin,String lin) {
        int estado=1,con=0;
        while(con!=tam){
            txtAutomata.setText(txtAutomata.getText()+(con+1)+".- ");
            switch(estado){
                case 1:
                    estado=validarQ1(txtAutomata,txtErrores,tokenArea,token[con]);
                    break;
                case 2:
                    estado=validarQ2(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 3:
                    estado=validarQ3(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 4:
                    estado=validarQ4(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 5:
                    estado=validarQ5(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 6:
                    estado=validarQ6(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 7:
                    estado=validarQ7(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 8:
                    estado=validarQ8(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 9:
                    estado=validarQ9(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 10:
                    estado=validarQ10(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 11:
                    estado=validarQ11(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 13:
                    estado=validarQ13(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 14:
                    estado=validarQ14(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 15:
                    estado=validarQ15(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 16:
                    estado=validarQ16(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 17:
                    estado=validarQ17(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 18:
                    estado=validarQ18(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 19:
                    estado=validarQ19(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 20:
                    estado=validarQ20(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 21:
                    estado=validarQ21(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 22:
                    estado=validarQ22(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 23:
                    estado=validarQ23(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 24:
                    estado=validarQ24(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 25:
                    estado=validarQ25(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 26:
                    estado=validarQ26(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 27:
                    estado=validarQ27(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 28:
                    estado=validarQ28(txtAutomata,txtErrores,tokenArea,token[con],nLin);
                    break;
                case 29:
                    return false;
            }
            txtAutomata.setText(txtAutomata.getText()+"\n\n");
            cToken++;
            con++;
        }
        return estado==12;
    }

    private int validarQ1(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("recurso",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q19");
            return 19;
        }
        if(evalER("grupo",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q13");
            return 13;
        }
        if(evalER("materia|asignarRecurso|asignarGrupo|asignarAula|asignarMaestro",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q25");
            return 25;
        }
        if(evalER("maestro",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q2");
            return 2;
        }
        if(evalER("aula|asignarHora",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q27");
            return 27;
        }
        
        txtErrores.setText(txtErrores.getText()+"\nSe desconoce el token "+token);
        return 29;
    }
    
    private int validarQ2(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\(",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q3");
            return 3;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un ( en la línea "+nLin);
        return 29;
    }
    
    private int validarQ3(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        //txt
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q4");
            return 4;
        
    }
    
    private int validarQ4(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q5");
            return 5;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ5(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("[0-9]|[1-9][0-9]",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q6");
            return 6;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un número en la línea "+nLin);
        return 29;
    }
    
    private int validarQ6(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q7");
            return 7;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ7(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("[0-9]|[1-9][0-9]",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q8");
            return 8;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un número en la línea "+nLin);
        return 29;
    }
    
    private int validarQ8(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q9");
            return 9;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ9(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("[0-9]|[1-9][0-9]",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q10");
            return 10;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un número en la línea "+nLin);
        return 29;
    }
    
    private int validarQ10(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\)",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q11");
            return 11;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un \\) en la línea "+nLin);
        return 29;
    }
    
    private int validarQ11(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER(";",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q12");
            return 12;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un \\) en la línea "+nLin);
        return 29;
    }
    
    private int validarQ13(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\(",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q14");
            return 14;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un \\( en la línea "+nLin);
        return 29;
    }
    
    private int validarQ14(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        //txt
        
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q15");
            return 15;
    }
    
    private int validarQ15(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q16");
            return 16;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ16(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("[0-9]|[1-9][0-9]",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q17");
            return 17;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un número en la línea "+nLin);
        return 29;
    }
    
    private int validarQ17(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q18");
            return 18;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ18(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        //txt
        
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q10");
            return 10;
        
    }
    
    private int validarQ19(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\(",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q20");
            return 20;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un \\( en la línea "+nLin);
        return 29;
    }
    
    private int validarQ20(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        //txt
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q21");
            return 21;
        
    }
    
    private int validarQ21(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q22");
            return 22;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ22(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("[0-9]|[1-9][0-9]",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q23");
            return 23;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un número en la línea "+nLin);
        return 29;
    }
    
    private int validarQ23(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\,",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q24");
            return 24;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un , en la línea "+nLin);
        return 29;
    }
    
    private int validarQ24(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("si|no",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q10");
            return 10;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un valor booleano en la línea "+nLin);
        return 29;
    }
    
    private int validarQ25(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\(",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q26");
            return 26;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un \\( en la línea "+nLin);
        return 29;
    }
    
    private int validarQ26(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        //txt
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q17");
            return 17;
        
    }
    
    private int validarQ27(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        if(evalER("\\(",token)){
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q28");
            return 28;
        }        
        txtErrores.setText(txtErrores.getText()+"\nError: Se esperaba un \\( en la línea "+nLin);
        return 29;
    }
    
    private int validarQ28(JTextArea txtAutomata, JTextArea txtErrores, JTextArea tokenArea, String token,int nLin) {
        txtAutomata.setText(txtAutomata.getText()+"Se evalúa el token "+token);
        tokenArea.setText(tokenArea.getText()+"\n"+cToken+".- "+token);
        
        //txt
            txtAutomata.setText(txtAutomata.getText()+"\nSe hace una transición a Q8");
            return 8;
        
    }
    
    private boolean evalER(String str, String car){
        Pattern pat = Pattern.compile(str);
        Matcher mat = pat.matcher(car);
        if(mat.matches()) return true;
        return false;
    }

    
}
