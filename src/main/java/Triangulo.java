public class Triangulo {
    public String Classificar(double a, double b, double c){
        if((a == b) && (b == c) && (c == a)){
            return "O Triangulo é equilátero";
        }else if((a == b) && (c != a)){
            return "O Triangulo é isósceles";
        }else if((a != b) && (c != a)){
            if((a<b+c) || (b<a+c) || (c<a+b)){
                return "O Triangulo é escaleno";
            }
        }
        return "Não forma um triangulo";
    }
}