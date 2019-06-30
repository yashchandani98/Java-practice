package A;
interface A
{
int a=1;
}
interface B
{
int b=1;
}
interface C extends A,B
{
int c;
}
class A extends A,B
{
}