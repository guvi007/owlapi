/* DLSyntaxParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. DLSyntaxParserTokenManager.java */
/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package org.semanticweb.owlapi.dlsyntax.parser;
import java.util.Set;
import java.util.HashSet;
import java.util.*;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.util.*;
import org.semanticweb.owlapi.model.*;

/** Token Manager. */ @SuppressWarnings("all")
public class DLSyntaxParserTokenManager implements DLSyntaxParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
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
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 30);
      case 13:
         return jjStartNfaWithStates_0(0, 2, 43);
      case 40:
         return jjStopAtPos(0, 10);
      case 41:
         return jjStopAtPos(0, 11);
      case 44:
         return jjStopAtPos(0, 31);
      case 46:
         return jjStopAtPos(0, 8);
      case 58:
         return jjStartNfaWithStates_0(0, 16, 43);
      case 91:
         return jjStopAtPos(0, 12);
      case 93:
         return jjStopAtPos(0, 13);
      case 123:
         return jjStopAtPos(0, 14);
      case 125:
         return jjStopAtPos(0, 15);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x20000L, 0x0L
};
static final long[] jjbitVec1 = {
   0x0L, 0x200000000L, 0x0L, 0x0L
};
static final long[] jjbitVec2 = {
   0x0L, 0x100000000L, 0x0L, 0x0L
};
static final long[] jjbitVec3 = {
   0x1000000L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec4 = {
   0x0L, 0x800000000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec5 = {
   0x0L, 0x0L, 0x80000L, 0x0L
};
static final long[] jjbitVec6 = {
   0x0L, 0x0L, 0x100000L, 0x0L
};
static final long[] jjbitVec7 = {
   0x0L, 0x0L, 0x100000000000L, 0x0L
};
static final long[] jjbitVec8 = {
   0x8L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec9 = {
   0x1L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec10 = {
   0x0L, 0x2000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec11 = {
   0x0L, 0x1000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec12 = {
   0x100L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec13 = {
   0x0L, 0x400000000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec14 = {
   0xfffffffafffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec16 = {
   0x0L, 0x0L, 0xffffefffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec17 = {
   0xffffffffffffffffL, 0xf7ffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec18 = {
   0xfffffffffffffeffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 121;
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
                  if ((0x8fffacfefffff9ffL & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     { jjCheckNAdd(43); }
                  }
                  else if (curChar == 61)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  else if (curChar == 60)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  else if (curChar == 62)
                  {
                     if (kind > 22)
                        kind = 22;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 62 && kind > 4)
                     kind = 4;
                  break;
               case 2:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 7:
                  if (curChar == 61 && kind > 5)
                     kind = 5;
                  break;
               case 8:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if (curChar == 61 && kind > 6)
                     kind = 6;
                  break;
               case 11:
                  if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 14:
                  if (curChar == 45 && kind > 9)
                     kind = 9;
                  break;
               case 35:
                  if (curChar == 62 && kind > 22)
                     kind = 22;
                  break;
               case 36:
                  if (curChar == 60)
                     kind = 23;
                  break;
               case 37:
                  if (curChar == 61 && kind > 24)
                     kind = 24;
                  break;
               case 43:
                  if ((0x8fffacfefffff9ffL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(43); }
                  break;
               case 116:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 117:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(117); }
                  break;
               case 118:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(118, 119); }
                  break;
               case 119:
                  if (curChar != 46)
                     break;
                  kind = 28;
                  { jjCheckNAdd(120); }
                  break;
               case 120:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  { jjCheckNAdd(120); }
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
                  if ((0xd7ffffff97ffffffL & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     { jjCheckNAdd(43); }
                  }
                  else if (curChar == 94)
                     jjstateSet[jjnewStateCnt++] = 14;
                  if (curChar == 101)
                     { jjAddStates(3, 4); }
                  else if (curChar == 92)
                     { jjAddStates(5, 14); }
                  else if (curChar == 116)
                     { jjAddStates(15, 16); }
                  else if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 41;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 38;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 33;
                  else if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 25;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 4;
                  if (curChar == 111)
                  {
                     if (kind > 7)
                        kind = 7;
                  }
                  break;
               case 3:
                  if (curChar == 98 && kind > 4)
                     kind = 4;
                  break;
               case 4:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 12:
                  if (curChar == 111 && kind > 7)
                     kind = 7;
                  break;
               case 15:
                  if (curChar == 94)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 17:
                  if (curChar == 100 && kind > 17)
                     kind = 17;
                  break;
               case 18:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 21:
                  if (curChar == 114 && kind > 18)
                     kind = 18;
                  break;
               case 22:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 24:
                  if (curChar == 116 && kind > 19)
                     kind = 19;
                  break;
               case 25:
               case 87:
                  if (curChar == 111)
                     { jjCheckNAdd(24); }
                  break;
               case 26:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 29:
                  if (curChar == 108 && kind > 21)
                     kind = 21;
                  break;
               case 30:
               case 96:
                  if (curChar == 108)
                     { jjCheckNAdd(29); }
                  break;
               case 31:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 38:
                  if (curChar == 110 && kind > 25)
                     kind = 25;
                  break;
               case 39:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 42:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if ((0xd7ffffff97ffffffL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(43); }
                  break;
               case 44:
                  if (curChar == 116)
                     { jjAddStates(15, 16); }
                  break;
               case 45:
                  if (curChar == 115 && kind > 26)
                     kind = 26;
                  break;
               case 46:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 101 && kind > 26)
                     kind = 26;
                  break;
               case 50:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 51:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 52:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 54:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 56:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if (curChar == 92)
                     { jjAddStates(5, 14); }
                  break;
               case 59:
                  if (curChar == 113 && kind > 4)
                     kind = 4;
                  break;
               case 60:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 63:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 67:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 118 && kind > 5)
                     kind = 5;
                  break;
               case 70:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 70;
                  break;
               case 72:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 75:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 77:
                  if (curChar == 112 && kind > 17)
                     kind = 17;
                  break;
               case 78:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 77;
                  break;
               case 79:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if (curChar == 112 && kind > 18)
                     kind = 18;
                  break;
               case 83:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 84:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 83;
                  break;
               case 85:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 88:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 115 && kind > 20)
                     kind = 20;
                  break;
               case 91:
               case 108:
                  if (curChar == 116)
                     { jjCheckNAdd(90); }
                  break;
               case 92:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 93:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 92;
                  break;
               case 94:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 93;
                  break;
               case 95:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 97:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 96;
                  break;
               case 98:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 100:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 101:
                  if (curChar == 113 && kind > 22)
                     kind = 22;
                  break;
               case 102:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 102;
                  break;
               case 104:
                  if (curChar == 113 && kind > 23)
                     kind = 23;
                  break;
               case 105:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 106:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 105;
                  break;
               case 107:
                  if (curChar == 101)
                     { jjAddStates(3, 4); }
                  break;
               case 109:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 110:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 111:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 110;
                  break;
               case 112:
                  if (curChar == 108 && kind > 24)
                     kind = 24;
                  break;
               case 113:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 112;
                  break;
               case 114:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 113;
                  break;
               case 115:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 114;
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
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 4)
                        kind = 4;
                  }
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 7)
                        kind = 7;
                  }
                  if (jjCanMove_4(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (jjCanMove_5(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 17)
                        kind = 17;
                  }
                  if (jjCanMove_6(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 18)
                        kind = 18;
                  }
                  if (jjCanMove_7(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  if (jjCanMove_8(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  if (jjCanMove_9(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  if (jjCanMove_10(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 22)
                        kind = 22;
                  }
                  if (jjCanMove_11(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  if (jjCanMove_12(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  if (jjCanMove_14(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 29)
                        kind = 29;
                     { jjCheckNAdd(43); }
                  }
                  break;
               case 6:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2) && kind > 5)
                     kind = 5;
                  break;
               case 9:
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 6)
                     kind = 6;
                  break;
               case 12:
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2) && kind > 7)
                     kind = 7;
                  break;
               case 13:
                  if (jjCanMove_4(hiByte, i1, i2, l1, l2) && kind > 9)
                     kind = 9;
                  break;
               case 16:
                  if (jjCanMove_5(hiByte, i1, i2, l1, l2) && kind > 17)
                     kind = 17;
                  break;
               case 20:
                  if (jjCanMove_6(hiByte, i1, i2, l1, l2) && kind > 18)
                     kind = 18;
                  break;
               case 23:
                  if (jjCanMove_7(hiByte, i1, i2, l1, l2) && kind > 19)
                     kind = 19;
                  break;
               case 27:
                  if (jjCanMove_8(hiByte, i1, i2, l1, l2) && kind > 20)
                     kind = 20;
                  break;
               case 28:
                  if (jjCanMove_9(hiByte, i1, i2, l1, l2) && kind > 21)
                     kind = 21;
                  break;
               case 35:
                  if (jjCanMove_10(hiByte, i1, i2, l1, l2) && kind > 22)
                     kind = 22;
                  break;
               case 36:
                  if (jjCanMove_11(hiByte, i1, i2, l1, l2) && kind > 23)
                     kind = 23;
                  break;
               case 40:
                  if (jjCanMove_12(hiByte, i1, i2, l1, l2) && kind > 25)
                     kind = 25;
                  break;
               case 41:
                  if (jjCanMove_13(hiByte, i1, i2, l1, l2) && kind > 26)
                     kind = 26;
                  break;
               case 43:
                  if (!jjCanMove_14(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(43); }
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
      if ((i = jjnewStateCnt) == (startsAt = 121 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\56", null, "\50", "\51", 
"\133", "\135", "\173", "\175", "\72", null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\12", "\54", };
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
   117, 118, 119, 111, 115, 68, 73, 76, 81, 86, 89, 95, 100, 103, 106, 48, 
   57, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec0[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec1[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_3(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec3[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_4(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 32:
         return ((jjbitVec4[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_5(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec5[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_6(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec6[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_7(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec7[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_8(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec8[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_9(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec9[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_10(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec10[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_11(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec11[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_12(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 34:
         return ((jjbitVec12[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_13(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 32:
         return ((jjbitVec13[i2] & l2) != 0L);
      default :
         return false;
   }
}
private static final boolean jjCanMove_14(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec16[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec17[i2] & l2) != 0L);
      case 34:
         return ((jjbitVec18[i2] & l2) != 0L);
      default :
         if ((jjbitVec14[i1] & l1) != 0L)
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

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
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

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    public DLSyntaxParserTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new RuntimeException("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  public DLSyntaxParserTokenManager (JavaCharStream stream, int lexState){
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
    for (i = 121; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  public void ReInit(JavaCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrException("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrException.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[121];
    private final int[] jjstateSet = new int[2 * 121];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
