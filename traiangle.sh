#triangle
if [ $a -gt $c ];then
echo "Syntax is : <0><no1><no2><no3>"
exit 1
fi
t=$a
a=$c
c=$t
fi

if [ $b -gt $c ];then
t=$b
b=$c
c=$t
fi


if [ `expr $a + $b` -gt $c ];then
echo "Triangle can be formed"
else 
echo " Triangle cannot be formed"
exit 1
fi

if [ $a -eq $b -o $A -eq $c ];then
echo "Equilateral traiangle"
fi
if [ $a -eq $b -o $a -eq $c ];then
echo "Isoceles triangle"
exit 0
fi

if [ `expr $a \* $a + $b \* $b` -eq `expr $c \* $C` ];then
echo"Right angled triangle "
fi



