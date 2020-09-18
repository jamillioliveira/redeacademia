import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class Academia {

	private static final Icon icon = null;
	private static final Component frame = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lista matriculados e planos
		//soma o numero de alunos ativos e nao-ativos
		
		boolean continuarCadastrar = false;
		int contAlunosInativos	= 0;
		int contAlunosAtivos	= 0;
		String nomeCompleto;
		int idade;
		double peso;
		double altura;
		String cpf;
		boolean status;
		String plano;
		
		
		//objetos para lista no POP
		Object[] options = { "sim", "nao" };
					 
		//instanciar a classe e criar a lista
		Aluno alunos = new Aluno();
		List aluno = new ArrayList();
		
		//instanciar a classe e criar a lista
		Pacote pacotes = new Pacote();
		List pacote = new ArrayList();
		
				
		//Cadastrar pacotes
		pacotes.setTipopacote("Plano A");
		pacote.add(pacotes.getTipopacote());
		
		pacotes.setTipopacote("Plano B");
		pacote.add(pacotes.getTipopacote());
			
		
		//cadastrar alunos
		//utilizar do loops
		
		do{
			//obter os dados
			nomeCompleto=	JOptionPane.showInputDialog("Nome Completo: ");
			idade       =	Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			peso 		=	Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
			altura		=	Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
			cpf 		=	JOptionPane.showInputDialog("Cpf: ");
			
			
			//verificar se ativo o usuario
			int resposta = JOptionPane.showOptionDialog(null, "Aluno Ativo ?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			
			if(resposta == 0) {
				status = true;
				contAlunosAtivos++;
			}
			else {
				status = false;
				contAlunosInativos++;

			}
			
			//Listar os planos no MENU
			Object[] planos = {pacote.get(0),pacote.get(1)};
				
			//escolher o plano do aluno
			plano = (String)JOptionPane.showInputDialog(
			                    frame,
			                    "Escolher o Plano:\n",
			                    "Planos",
			                    JOptionPane.PLAIN_MESSAGE,
			                    icon,
			                    planos,
			                    planos[0]);

			//settar na classe
			alunos.setNomecompleto(nomeCompleto);
			alunos.setIdade(idade);
			alunos.setPeso(peso);
			alunos.setCpf(cpf);
			alunos.setAltura(altura);
			alunos.setStatus(status);
			alunos.setPlano(plano);
			
			//add a lista
			aluno.add(alunos);
			
	
			//verificar se ativo o usuario
			 resposta = JOptionPane.showOptionDialog(null, "Continuar a cadastrar Alunos ?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			
			 if(resposta == 0)
			  continuarCadastrar = true; 
			else
			  continuarCadastrar = false;
			 
		}while (continuarCadastrar);
		
	
		//listar alunos
		System.out.println("\n Aluno Matriculado: ");
		for (int i = 0; i < aluno.size(); i++) {
			System.out.println("Nomes:"+((Aluno)aluno.get(0)).getNomecompleto());
			System.out.println("Pacotes/Planos:"+((Aluno)aluno.get(0)).getPlano());
		}
		System.out.println("\n Quantitativos de Alunos: ");
		System.out.println("Alunos Ativos: "+contAlunosAtivos);
		System.out.println("Alunos Inativos: "+contAlunosInativos);
		
		
	}

}
