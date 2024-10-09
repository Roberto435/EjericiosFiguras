public class Figuras {
    public void Cuadrado(int altura)
    {
        for (int i = 0; i < altura; i++)
        {

            for (int j = 0; j < altura; j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public void Triangulo(int altura)
    {
        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public void TrianguloInver(int altura)
    {
        for (int i = altura; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void TrianguloEqui(int altura)
    {
        for (int i = 0; i < altura; i++)
        {
            for (int j = altura - i; j > 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void TrianguloEspj(int altura)
    {
        for (int i = 0; i < altura; i++)
        {

            for (int j = 0; j < altura; j++)
            {
                if (j + 1 < altura - i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    public void TrianguloInverEspj(int altura)
    {
        for (int i = altura; i > 0; i--)
        {

            for (int j = 0; j < altura; j++)
            {
                if (j < altura - i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public void Rombo(int altura)
    {
        for (int i = 1; i <= altura; i++)
        {
            for (int j = i; j < altura; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--)
        {
            for (int j = altura; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
