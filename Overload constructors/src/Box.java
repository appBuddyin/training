public class Box {
double height;
double width;
double depth;
Box(double h,double w,double d)
{
    width=w;
    height=h;
    depth=d;
}

Box()
{
    width=-1;
    height=-1;
    depth=-1;
}

Box(double len)
{
 width=height=depth=len;
}

Box(Box ob)
{
    width=ob.width;
    height=ob.height;
    depth=ob.depth;
}

double volume()
{
 return width*height*depth;
}
}
