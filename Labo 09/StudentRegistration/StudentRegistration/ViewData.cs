using System;
using System.Windows.Forms;

namespace StudentRegistration
{
    public partial class ViewData : UserControl
    {
        public ViewData()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se puede dejar el campo vacio");
            }
            else
            {
                try
                {
                    var dt = ConnectionDB.ExecuteQuery($"SELECT DISTINCT mat.idMateria, mat.nombre " +
                                                       "FROM INSCRIPCION ins, MATERIA mat, ESTUDIANTE est " +
                                                       $"WHERE ins.idmateria = mat.idMateria " +
                                                       $"AND ins.carnet = '{textBox1.Text}'");

                    dataGridView1.DataSource = dt;
                    MessageBox.Show("Datos obtenidos exitosamente");


                }
                catch (Exception ex)
                {
                    MessageBox.Show("Ha ocurrido un error");
                }
            }
        }
    }
}