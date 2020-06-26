package n3;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import n3.entity.Frete;
import n3.entity.FreteDemanda;
import n3.entity.FreteRegular;
import n3.entity.Mercadoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

// 1- regular
// 2- demanda

public class SistemController {

    private HashMap<Integer, Frete> listFreteRegular;

    private Gson gson = new Gson();
    private Connection con;

    public void salvarFrete(FreteDemanda frete) {
        JsonElement jsonFrete = gson.toJsonTree(frete);
        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps;
            ps = con.prepareStatement("insert into frete (json) values('" + jsonFrete + "')");
            ps.execute();
            ps.close();

            carregaFrete(jsonFrete);

        } catch (Exception e) {
            System.out.println("erro ao salvar o frete no banco");
        }
    }

    public void salvarFrete(FreteRegular frete) {
        JsonElement jsonFrete = gson.toJsonTree(frete);
        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps;
            ps = con.prepareStatement("insert into frete (json) values('" + jsonFrete + "')");
            ResultSet resut = ps.executeQuery();
            ps.execute();
            ps.close();


        } catch (Exception e) {
            System.out.println("erro ao salvar o frete no banco");
        }
    }

    public void salvaMercadoria(Mercadoria mercadoria) {
        JsonElement jsonMercadoria = gson.toJsonTree(mercadoria);
        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps;
            ps = con.prepareStatement("insert into mercadoria (json) values('" + jsonMercadoria + "')");
            ps.execute();
            ps.close();

        } catch (Exception e) {
            System.out.println("erro ao salvar a mercadoria no banco");
        }
    }

    public void carregaFrete(JsonElement jsonFrete) {
        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from frete where frete =''" + jsonFrete + "'");
            ResultSet result = ps.executeQuery();


            while (result.next()) {
                if (result.getInt("tipoFrete") == 1) {
                    // regular

                    FreteRegular regular = gson.fromJson(result.getString("frete"), FreteRegular.class);

                    listFreteRegular.put(result.getInt("id"), regular);

                } else {
                    FreteDemanda regular = gson.fromJson(result.getString("frete"), FreteDemanda.class);

                    listFreteRegular.put(result.getInt("id"), regular);
                }


            }

        } catch (Exception e) {

        }
    }


    public void carregaMercadoria(Integer id) {

    }

}
