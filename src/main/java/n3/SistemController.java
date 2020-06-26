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

    private HashMap<Integer, Frete> listFretes = new HashMap<Integer, Frete>();
    private HashMap<Integer, Mercadoria> listMercadoria = new HashMap<Integer, Mercadoria>();

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

            carregaFrete();

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
            ps.execute();
            ps.close();

            carregaFrete();
        } catch (Exception e) {
            System.out.println("erro ao salvar o frete no banco");
        }
    }

    public void salvaMercadoria(Mercadoria mercadoria) {
        JsonElement jsonMercadoria = gson.toJsonTree(mercadoria);
        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps;
            ps = con.prepareStatement("insert into mercadoria (mercadoria) values('" + jsonMercadoria + "')");
            ps.execute();
            ps.close();

            carregaMercadoria();

        } catch (Exception e) {
            System.out.println("erro ao salvar a mercadoria no banco");
        }
    }

    public void carregaFrete() {
        this.getListFretes().clear();
        this.getListFretes().clear();

        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from frete");
            ResultSet result = ps.executeQuery();


            while (result.next()) {
                if (result.getInt("tipoFrete") == 1) {
                    // regular

                    FreteRegular regular = gson.fromJson(result.getString("frete"), FreteRegular.class);

                    listFretes.put(result.getInt("id"), regular);

                } else {
                    FreteDemanda regular = gson.fromJson(result.getString("frete"), FreteDemanda.class);

                    listFretes.put(result.getInt("id"), regular);
                }


            }

        } catch (Exception e) {
            System.out.println("Erro ao carregar o frete!");
        }
    }


    public void carregaMercadoria() {

        this.getListMercadoria().clear();

        con = Main.getDbManager().getConnection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from mercadoria");
            ResultSet result = ps.executeQuery();


            while (result.next()) {
                Mercadoria mercadoria = null;

                mercadoria = gson.fromJson(result.getString("mercadoria"), Mercadoria.class);

                listMercadoria.put(result.getInt("id"), mercadoria);

            }

        } catch (Exception e) {

        }
    }

    public HashMap<Integer, Frete> getListFretes() {
        return listFretes;
    }

    public HashMap<Integer, Mercadoria> getListMercadoria() {
        return listMercadoria;
    }
}
