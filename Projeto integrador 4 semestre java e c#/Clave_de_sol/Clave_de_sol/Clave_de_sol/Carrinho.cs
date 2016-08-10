using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Clave_de_sol
{
    public class Carrinho
    {
        int cod_prod;

        string nome;

        double valor;

        double subtotal;

        int quantidade;

        public double calculaSubtotal()
        {
            return quantidade * valor;
        }
        
        public int Cod_prod
        {
            get
            {
                return cod_prod;
            }

            set
            {
                cod_prod = value;
            }
        }

        public string Nome
        {
            get
            {
                return nome;
            }

            set
            {
                nome = value;
            }
        }

        public double Valor
        {
            get
            {
                return valor;
            }

            set
            {
                valor = value;
            }
        }

        public double Subtotal
        {
            get
            {
                return subtotal;
            }

            set
            {
                subtotal = quantidade * valor;
            }
        }

        public int Quantidade
        {
            get
            {
                return quantidade;
            }

            set
            {
                quantidade = value;
            }
        }

    }
}
