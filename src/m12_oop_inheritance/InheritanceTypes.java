package m12_oop_inheritance;

public class InheritanceTypes {
}

// Single inheritance

class Food {}
class Pizza extends Food{}

// --------------------------------
// Multi level inheritance

class Device {}
class Phone extends Device {}
class IphoneX extends Phone {}

// --------------------------------
// Hierarchical inheritance

class Tree {}
class OakTree extends Tree{}
class MapleTree extends Tree{}

// --------------------------------
// Java does not allow multiple inheritance: more than one direct parent

class A {}
class B {}
//class C extends A, B {}
