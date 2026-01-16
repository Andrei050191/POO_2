# Lab 3: Candy Box OOP Architecture Guide

## Project Overview
This is an Object-Oriented Programming exercise (Lab 3) modeling a birthday gift delivery system using polymorphism and composition.

**Package**: `edu.usarb.poo.java`  
**Core Concept**: Inheritance hierarchy with specialized candy box types and a container system.

## Architecture & Key Patterns

### Inheritance Hierarchy
- **`CandyBox`** (Abstract Base)
  - Base class for all candy types
  - Implements `equals()` comparing flavor and origin
  - Defines abstract `getVolume()` method
  - Contains `toString()` for display: "The [origin] [flavor]"

- **Concrete Implementations**
  - `Lindt` (Switzerland): 3D rectangular box — `length × width × height`
  - `Baravelli` (Italy): Cylindrical — `π × radius² × height`
  - `ChocAmor` (France): Cubic — `length³`
  - Each provides dimension printer (`printLindtDim()`, etc.)

### Composition Pattern
- **`CandyBag`**: Container holding `ArrayList<CandyBox>`
  - Manages collection: `addBox()`, `getBoxes()`
  - `toString()` iterates and displays all boxes
  - `testEquality()`: Compares first two boxes using `CandyBox.equals()`

- **`Area`**: Delivery address + gift presentation
  - Stores `CandyBag`, address number, and street
  - `getBirthdayCard()`: Main display method
    - Prints address and greeting
    - **Runtime Type Checking**: Uses `instanceof` to dispatch to appropriate printer
    - Polymorphic iteration: `for (CandyBox box : candyBag.getBoxes())`

## Critical Data Flows

1. **Instantiation** → **Aggregation** → **Polymorphic Dispatch**
   ```
   Lindt/Baravelli/ChocAmor → CandyBag.addBox() → Area.candyBag
   ```

2. **Display Logic** (`Area.getBirthdayCard()`)
   - Iterates `CandyBag.getBoxes()` (returns ArrayList)
   - Uses `instanceof` to identify concrete type
   - Calls type-specific printer method (e.g., `((Lindt) box).printLindtDim()`)

## Important Implementation Details

- **Volume Calculation**: Each subclass implements unique math
  - Lindt: rectangular formula
  - Baravelli: cylindrical formula using `Math.PI`
  - ChocAmor: cubic formula
  - **Note**: Base `CandyBox.getVolume()` returns 0 (dummy implementation)

- **Equality Contract**: Base class implements `equals()` by comparing `flavor` and `origin` strings; all subclasses inherit this behavior

- **String Representation**: `CandyBox.toString()` format is inherited by all subclasses

## Compile & Run

Standard Java compilation:
```bash
javac *.java
java -cp . edu.usarb.poo.java.Main
```

## Common Modification Points

- **Adding new candy types**: Extend `CandyBox`, implement `getVolume()`, add printer method
- **Changing display logic**: Edit `Area.getBirthdayCard()` — consider refactoring `instanceof` chain to visitor or strategy pattern if extending
- **Updating volume formulas**: Modify implementation in respective subclass `getVolume()`
