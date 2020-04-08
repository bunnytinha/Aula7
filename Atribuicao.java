//classe
public class Atribuicao
{
   //atribuicao
   private Professor professor;
   private Disciplina disciplina;
   //construtor
   public Atribuicao(Professor professor, Disciplina disciplina)
   {
      this.professor = professor;
      this.disciplina = disciplina;
   }
   //metodos de acesso
   public Professor getProfessor()
   {
      return professor;
   }
   public Disciplina getDisciplina()
   {
      return disciplina;
   }
   //metodos de modificacao
   public void setProfessor(Professor professor)
   {
      this.professor = professor;
   }
   public void setDisciplina(Disciplina disciplina)
   {
      this.disciplina = disciplina;
   }
   //metodo getDados
   public String getDados()
   {
      return "Atribuicao [ professor = " + professor + ", disciplina = " + disciplina + "]";
   }
}