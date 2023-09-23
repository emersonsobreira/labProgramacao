package questão08;

import java.util.List;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        List<Imprimivel> itensParaImprimir = new ArrayList<>();
         itensParaImprimir.add(new Documento("foi adicionado um documento de  textos."));
         itensParaImprimir.add(new Foto("foi adicionado uma foto."));

  
         itensParaImprimir.forEach(Imprimivel::imprimir);
        


    }
    
}
