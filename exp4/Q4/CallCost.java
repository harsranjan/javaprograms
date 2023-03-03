import java.util.*;
abstract class TelephoneExchange
{
public int charge_of_onesecond=5;
}
class OrdinaryCalls extends TelephoneExchange
{
public int ordinaryCharge(int duration)
{
int c=0;
c+=super.charge_of_onesecond*duration;
return c;
}
}
class UrgentorCalls extends TelephoneExchange
{
int urgentcost=0;
public int urgentCharge(int duration)
{
urgentcost+=(super.charge_of_onesecond*duration +
(super.charge_of_onesecond*duration*20)/100);
int u=0;
u+=urgentcost;
return u;
}
}
class LightningCalls extends TelephoneExchange
{
int lightningcost=0;
public int lightningCharge(int duration)
{
lightningcost+=(super.charge_of_onesecond*duration +
(super.charge_of_onesecond*duration*50)/100);
int l=0;
l+=lightningcost;
return l;
}\
}
class CallCost{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
OrdinaryCalls o = new OrdinaryCalls();
UrgentorCalls ur = new UrgentorCalls();
LightningCalls li = new LightningCalls();
System.out.print("Enter duration of call: ");
int input=s.nextInt();
int ordinary=o.ordinaryCharge(input);
int urgent=ur.urgentCharge(input);
int lightning=li.lightningCharge(input);
System.out.println("Cost for Ordinary Calls: "
+ ordinary);
System.out.println("Cost for Urgent Calls: " +
urgent);
System.out.println("Cost for Lightning Calls: "
+ lightning);
}
}