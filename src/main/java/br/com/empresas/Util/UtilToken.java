package br.com.empresas.Util;

import com.sun.jersey.core.util.Base64;
public class UtilToken {

    private String criterios;

    private int pagina;

    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getCriterios() {
        return criterios;
    }

    public void setCriterios(String criterios) {
        this.criterios = criterios;
    }

    public static String decode(String token){

        String[] tk = token.split(" ");
        String decode = Base64.base64Decode(tk[1]);
        decode = decode.substring(0,4);
        String[] a = decode.split("&");
        return a[0];
    }

    public static int decodeId(String token){

        String[] tk = token.split(" ");
        String decode = Base64.base64Decode(tk[1]);
        String[] id = decode.split("&");

        return Integer.parseInt(id[1]);
    }

    public static String[] decodeUsersApp(String token){

        String decode = Base64.base64Decode(token);
        String[] tk = decode.split("&");
        return tk;
    }
}
