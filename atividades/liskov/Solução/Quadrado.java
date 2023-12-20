public class Square extends Rectangle {

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    
/*Como um quadrado tem lados iguais,
 apenas colocar uma das informações como width ou height já é o 
 suficiente para o mesmo, aproveitando, tirei o sobscrever do mesmo 
 as informações do retângulo, assim cada um funciona individualmente 
 e podem se substituir sem interferirem nos mesmos */

}