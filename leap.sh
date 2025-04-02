
if [ $# -gt 1 ]
then 
echo "Too many argumets"
exit 1
fi

if [ $# -eq 0 ]
then
yr=`date "+%y"`
else
yr=$1
fi
d4=`expr $yr % 4`
d100=`expr $yr % 100`
d400=`expr $yr % 400`
if [ $d4 -eq 0 -a $d100 -ne 0 ] || [ $d400 -eq 0 ]
then 
echo "It is a leap year"
else
echo "It is not a leap year"
fi



