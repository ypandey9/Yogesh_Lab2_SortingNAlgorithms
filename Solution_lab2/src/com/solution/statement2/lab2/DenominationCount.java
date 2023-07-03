package com.solution.statement2.lab2;

public class DenominationCount {
public void notesCountImplementation(int[] notes,int amount)
{
int[] noteCount=new int [notes.length];
for(int i=0;i<notes.length;i++)
{
if(amount>=notes[i])
{
noteCount[i]=amount/notes[i];
amount=amount-noteCount[i]*notes[i];
}
}
for(int i=0;i<notes.length;i++)
{
if(noteCount[i]!=0)
{
System.out.println(notes[i]+":"+noteCount[i]);	
}
}
}
}


