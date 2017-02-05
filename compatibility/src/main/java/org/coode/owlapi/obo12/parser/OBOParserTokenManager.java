/* OBOParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. OBOParserTokenManager.java */
package org.coode.owlapi.obo12.parser;
import org.semanticweb.owlapi.model.*;
import java.net.*;
import java.util.*;

/** Token Manager. */ @SuppressWarnings("all")
public class OBOParserTokenManager implements OBOParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjMoveStringLiteralDfa0_4()
{
   return jjMoveNfa_4(5, 0);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_4(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 7;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     { jjCheckNAddTwoStates(0, 1); }
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if (curChar == 34)
                  {
                     if (kind > 10)
                        kind = 10;
                  }
                  break;
               case 0:
                  if ((0xfffffffbffffdbffL & l) == 0L)
                     break;
                  kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 2:
                  if (curChar != 34)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 3:
                  if (curChar != 10)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 4:
                  if (curChar != 13)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 6:
                  if ((0x2400L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  if (curChar == 92)
                     { jjAddStates(0, 2); }
                  break;
               case 0:
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 1:
                  if (curChar == 92)
                     { jjAddStates(0, 2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_3(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_3(int pos, long active0){
   return jjMoveNfa_3(jjStopStringLiteralDfa_3(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_3(){
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 15);
      case 34:
         return jjStartNfaWithStates_3(0, 8, 0);
      default :
         return jjMoveNfa_3(2, 0);
   }
}
private int jjStartNfaWithStates_3(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_3(state, pos + 1);
}
private int jjMoveNfa_3(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0xfffffffcffffd9ffL & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                     { jjCheckNAdd(0); }
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  else if ((0x100000200L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 0:
                  if ((0xfffffffcffffd9ffL & l) == 0L)
                     break;
                  kind = 12;
                  { jjCheckNAdd(0); }
                  break;
               case 1:
                  if ((0x100000200L & l) == 0L)
                     break;
                  kind = 13;
                  { jjCheckNAdd(1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  kind = 12;
                  { jjCheckNAdd(0); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAdd(0); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 91:
         return jjStopAtPos(0, 3);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfbffffffffffdbffL & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     { jjCheckNAdd(3); }
                  }
                  if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 33)
                  {
                     if (kind > 2)
                        kind = 2;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 1:
                  if (curChar != 33)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAdd(2); }
                  break;
               case 2:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if ((0xfbffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAdd(3); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 3:
                  if ((0xfffffffff7ffffffL & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAdd(3); }
                  break;
               case 2:
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 3:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 6)
                     kind = 6;
                  { jjCheckNAdd(3); }
                  break;
               case 2:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_1(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_1(int pos, long active0){
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 93:
         return jjStopAtPos(0, 5);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 4;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffdfffffffL & l) == 0L)
                     break;
                  kind = 4;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_5()
{
   return jjMoveNfa_5(5, 0);
}
private int jjMoveNfa_5(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 5;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0xffffffffffffdbffL & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     { jjCheckNAddTwoStates(0, 1); }
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     { jjCheckNAdd(4); }
                  }
                  break;
               case 0:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  kind = 16;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 2:
                  if (curChar != 10)
                     break;
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 3:
                  if (curChar != 13)
                     break;
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 4:
                  if ((0x2400L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAdd(4); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAddTwoStates(0, 1); }
                  if (curChar == 92)
                     { jjAddStates(3, 4); }
                  break;
               case 0:
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               case 1:
                  if (curChar == 92)
                     { jjAddStates(3, 4); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAddTwoStates(0, 1); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2()
{
   return jjMoveNfa_2(0, 0);
}
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar != 58)
                     break;
                  kind = 7;
                  { jjCheckNAdd(1); }
                  break;
               case 1:
                  if (curChar != 32)
                     break;
                  kind = 7;
                  { jjCheckNAdd(1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, "\133", null, "\135", null, null, null, null, null, null, null, 
null, null, null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   t.image = curTokenImage;

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   2, 3, 4, 2, 3, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       if (jjmatchedPos == 0 && jjmatchedKind > 18)
       {
          jjmatchedKind = 18;
       }
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       break;
     case 3:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_3();
       break;
     case 4:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_4();
       break;
     case 5:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_5();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrException(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrException.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    public OBOParserTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new RuntimeException("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  public OBOParserTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  public void ReInit(JavaCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 7; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  public void ReInit(JavaCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  public void SwitchTo(int lexState)
  {
    if (lexState >= 6 || lexState < 0)
      throw new TokenMgrException("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrException.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_STANZA_HEADER",
   "IN_TAG_VALUE_PAIR",
   "IN_TAG_VALUE",
   "IN_QUOTED_STRING",
   "IN_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, 1, -1, 0, 2, 3, 4, -1, 3, 0, -1, -1, 0, 5, -1, 0, -1, 
};
static final long[] jjtoToken = {
   0x53279L, 
};
static final long[] jjtoSkip = {
   0x2cd86L, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[7];
    private final int[] jjstateSet = new int[2 * 7];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
