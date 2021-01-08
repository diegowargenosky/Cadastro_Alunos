package Aluno;

import javax.swing.JOptionPane;

import ClassesAuxiliares.Funcao_Autenticacao;
import Constantes.statusAluno;
import Interfaces.permitirAcesso;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Login");
		String senha = JOptionPane.showInputDialog("Senha");

		permitirAcesso permitirAcesso = new Secretario(login, senha);

		if (permitirAcesso.Autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			JOptionPane.showMessageDialog(null, "Iniciando o cadastro dos alunos");

			for (int qtde = 0; qtde < 2; qtde++) {

				String nome = JOptionPane.showInputDialog("Nome do aluno " + (qtde + 1));
				String idade = JOptionPane.showInputDialog("Idade");
				String dataNasc = JOptionPane.showInputDialog("Data de nascimento");
				String Registrogeral = JOptionPane.showInputDialog("RG");
				String numCPF = JOptionPane.showInputDialog("CPF");
				String nomePai = JOptionPane.showInputDialog("Nome do pai");
				String nomeMae = JOptionPane.showInputDialog("Nome da mãe");
				String dataMatricula = JOptionPane.showInputDialog("Data da matrícula");
				String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
				String serieMatriculado = JOptionPane.showInputDialog("Série da matrícula");

				Aluno aluno = new Aluno();

				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));
				aluno.setDataNascimento(dataNasc);
				aluno.setRegistroGeral(Registrogeral);
				aluno.setNumeroCpf(numCPF);
				aluno.setNomePai(nomePai);
				aluno.setNomeMae(nomeMae);
				aluno.setDataMatricula(dataMatricula);
				aluno.setNomeEscola(nomeEscola);
				aluno.setSerieMatriculado(serieMatriculado);

				for (int pos = 0; pos < 2; pos++) {

					Disciplina disciplina = new Disciplina();

					String nomeDisciplina = JOptionPane.showInputDialog("Disciplina " + pos);
					String notaDisciplina = JOptionPane.showInputDialog("Nota");

					double notas = Double.valueOf(notaDisciplina);

					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(notas);

					aluno.getDisciplinas().add(disciplina);

				}
				alunos.add(aluno);

				JOptionPane.showMessageDialog(null, "Alunos cadastrados:");
				for (Aluno a : alunos) {

					JOptionPane.showMessageDialog(null, a.getNome());

				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja deletar algum aluno da lista?");

				if (escolha == 0) {

					String removerAluno = JOptionPane.showInputDialog("Qual deles? 1,2,3,...?");
					alunos.remove(Integer.valueOf(removerAluno).intValue() - 1);

				}

			}

			maps.put(statusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(statusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(statusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno1 : alunos) {

				if (aluno1.getAlunoAprovado2().equalsIgnoreCase(statusAluno.APROVADO)) {
					maps.get(statusAluno.APROVADO).add(aluno1);
				} else if (aluno1.getAlunoAprovado2().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
					maps.get(statusAluno.RECUPERACAO).add(aluno1);
				} else {
					maps.get(statusAluno.REPROVADO).add(aluno1);
				}
			}

			System.out.println("------------------Lista dos aprovados----------------------\n");
			for (Aluno aluno1 : maps.get(statusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno1.getNome() + " " + aluno1.getAlunoAprovado2() + " com média de: "
						+ aluno1.getMediaNota() + "\n");
			}

			System.out.println("------------------Lista dos reprovados----------------------\n");
			for (Aluno aluno1 : maps.get(statusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno1.getNome() + " " + aluno1.getAlunoAprovado2() + " com média de: "
						+ aluno1.getMediaNota() + "\n");
			}

			System.out.println("------------------Lista dos alunos em recuperação----------------------\n");
			for (Aluno aluno1 : maps.get(statusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno1.getNome() + " " + aluno1.getAlunoAprovado2() + " com média de: "
						+ aluno1.getMediaNota() + "\n");
			}

			System.out.println("Alunos maiores e menores de idade:\n");

			for (Aluno aluno1 : alunos) {

				System.out.println(aluno1.getNome() + ": " + aluno1.msgMaioridade());

			}

		}

		else
			JOptionPane.showMessageDialog(null, "Acesso negado!");

	}
}
