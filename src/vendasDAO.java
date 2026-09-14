
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class vendasDAO {
    
    private ArrayList<vendasDTO> listagem = new ArrayList<>();

    public void cadastrarVenda(vendasDTO venda) {
         venda.setId(listagem.size() + 1);
        listagem.add(venda);
    }

    public ArrayList<vendasDTO> listarVendas() {
        return listagem;
    }
}
