/*
Neste código, a classe Shape possui um método draw() que verifica o tipo de forma 
(circle, rectangle ou triangle) e chama o método correspondente para desenhar a forma. 
Isso viola o Princípio OCP, pois a classe está aberta para modificação 
sempre que um novo tipo de forma é adicionado.
*/

import java.util.ArrayList;

public class Shape{

public static void main(String[] args) {
    ArrayList<Desenhaforma> formas=new ArrayList();
   formas.add(new circle());
   formas.add(new triangle());
   formas.add(new rectangle());

   formas.forEach((forma)->forma.desenha());
    }
}