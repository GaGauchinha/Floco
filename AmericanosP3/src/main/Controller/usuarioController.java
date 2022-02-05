package Controller;

import DAO.Usuario_DAO;
import Dados.Tipos;
import Dados.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("usuario-controller")
public class usuarioController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String opcao=req.getParameter("opcao");
        switch (opcao){
            case "excluir":
                String id = req.getParameter("id");
                System.out.println("ID excluir"+id);
                break;
            case "editar":
                int id_usuario = Integer.parseInt(req.getParameter("id_usuario"));
                Usuario usuario = new Usuario_DAO().getUsuario(id_usuario);
                req.setAttribute("Usuario", usuario);
                break;
            case "Cadastrar":
                String nome=req.getParameter("nome");
                String email=req.getParameter("email");
                String senha=req.getParameter("senha");
                String tipodoc=req.getParameter("tipodoc");
                Long doc = Long.valueOf(req.getParameter("doc"));
                Date data_nascimento= Date.valueOf(req.getParameter("data_nascimento"));
                String endereco=req.getParameter("endereco");

                Tipos t= new Tipos(1,"Usuario");
                Usuario usuario = new Usuario(nome,email,senha,tipodoc,doc,data_nascimento,endereco);
                int id = Integer.parseInt(req.getParameter("id_usuario"));
                if(id>0){
                    usuario.setId(Integer.parseInt(req.getParameter("id_usuario")));
                }else{
                    Usuario usuario = new Usuario(nome, email, senha, tipodoc, doc, data_nascimento, endereco);
                }
        }
    }
}
