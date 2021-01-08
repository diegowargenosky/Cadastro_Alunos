package Aluno;

import java.util.List;

import Constantes.statusAluno;

import java.util.ArrayList;

/* Esta é a nossa classe/objeto que representa o Aluno */



 public class Aluno  extends Pessoa {
	
	// Esses são os atributos do Aluno //

		// Por padrão todos os atributos são incialmente privados //

		
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;

		private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}

		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}

		public Aluno() { /* Cria os dados na memória - Sendo padrão do Java */

		}

		/* Construtor de objeto com um parâmetro */

		public Aluno(String nomePadrao) {

			nome = nomePadrao;
		}

		/* Construtor de objeto com dois parâmetros */
		public Aluno(String nomePadrao, int idadePadrao) {

			nome = nomePadrao;
			idade = idadePadrao;
		}

		// Veremos os métodos SETTERS e GETTERS do Objeto //

		// SET é para adicionar ou receber dados para os atributos //
		// GET é para resgatar ou obter o valor do atributo //

		// Recebe dados //
		public void setNome(String nome) {

			this.nome = nome;
		}

		public String getNome() {

			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}

		// * Método que retorna a média do aluno *//
		public double getMediaNota() {

			double somaNotas = 0.0;
			for (Disciplina disciplina : disciplinas) {
				
				somaNotas += disciplina.getNota();
			}

			return somaNotas / disciplinas.size();
		}

		// * Método que retorna true para aprovado ou falso para reprovado *//
		public boolean getAlunoAprovado() {
			double media = this.getMediaNota();

			if (media >= 7) {
				return true;
			} else {
				return false;
			}

		}

		// * Este método retorna diretamente uma String *//
		public String getAlunoAprovado2() {
			double media = this.getMediaNota();

			if (media >= 5) {
				if (media >= 7) {
					return statusAluno.APROVADO;
				} else {
					return statusAluno.RECUPERACAO;
				}

			} else {
				return statusAluno.REPROVADO;
			}

		}
		
		
		
	
		//* Mas se em vez de 18 anos eu quiser verificar se os Alunos são maiores ou menores de 21 eu dou um override *//
		@Override
		public boolean pessoaMaioridade() {
			
			return idade >= 21;
		}
		
		public String msgMaioridade() {
			
			return this.pessoaMaioridade() ? "Aluno é maior de idade":"Aluno é menor de idade";
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
					+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
					+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
					+ serieMatriculado + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}

		@Override
		public double salario() {
			// TODO Auto-generated method stub
			return 0;
		}

		
		
		
	
	
	
	

	
}
