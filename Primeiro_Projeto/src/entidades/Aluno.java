package Aluno;

import java.util.List;

import Constantes.statusAluno;

import java.util.ArrayList;

/* Esta � a nossa classe/objeto que representa o Aluno */



 public class Aluno  extends Pessoa {
	
	// Esses s�o os atributos do Aluno //

		// Por padr�o todos os atributos s�o incialmente privados //

		
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

		public Aluno() { /* Cria os dados na mem�ria - Sendo padr�o do Java */

		}

		/* Construtor de objeto com um par�metro */

		public Aluno(String nomePadrao) {

			nome = nomePadrao;
		}

		/* Construtor de objeto com dois par�metros */
		public Aluno(String nomePadrao, int idadePadrao) {

			nome = nomePadrao;
			idade = idadePadrao;
		}

		// Veremos os m�todos SETTERS e GETTERS do Objeto //

		// SET � para adicionar ou receber dados para os atributos //
		// GET � para resgatar ou obter o valor do atributo //

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

		// * M�todo que retorna a m�dia do aluno *//
		public double getMediaNota() {

			double somaNotas = 0.0;
			for (Disciplina disciplina : disciplinas) {
				
				somaNotas += disciplina.getNota();
			}

			return somaNotas / disciplinas.size();
		}

		// * M�todo que retorna true para aprovado ou falso para reprovado *//
		public boolean getAlunoAprovado() {
			double media = this.getMediaNota();

			if (media >= 7) {
				return true;
			} else {
				return false;
			}

		}

		// * Este m�todo retorna diretamente uma String *//
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
		
		
		
	
		//* Mas se em vez de 18 anos eu quiser verificar se os Alunos s�o maiores ou menores de 21 eu dou um override *//
		@Override
		public boolean pessoaMaioridade() {
			
			return idade >= 21;
		}
		
		public String msgMaioridade() {
			
			return this.pessoaMaioridade() ? "Aluno � maior de idade":"Aluno � menor de idade";
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
