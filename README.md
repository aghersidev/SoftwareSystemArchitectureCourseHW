# Vending Machine MDA-EFSM Assignment (CS 586)

This repository contains the solution to a **course assignment** for CS 586 (Spring 2025).  
The assignment focuses on applying **Model-Driven Architecture (MDA)** principles to the design of state-based software components using **Extended Finite State Machines (EFSMs)**.

## Assignment Objective

The main objective is to design a **generic, executable MDA-EFSM meta-model** capable of controlling multiple vending machine variants that differ in:

- Payment mechanisms
- Products dispensed
- Additives offered
- Operation names and data types

A single MDA-EFSM must capture the **common control behavior** of all vending machines, while variability is handled through data, actions, and component configuration rather than duplicated state logic.

## Learning Objectives

Through this assignment, the student is expected to:

- Apply **Model-Driven Architecture** to separate abstract behavior from concrete implementations
- Model complex system behavior using **Extended Finite State Machines**
- Identify and extract **common behavior** from heterogeneous systems
- Design software with **high cohesion and low coupling**
- Bridge formal behavioral models with **object-oriented design**
- Apply classical **object-oriented design patterns** to implement state-based systems

## Concepts Applied

This assignment evaluates the application of:

- Model-Driven Architecture (MDA)
- Extended Finite State Machines (EFSM)
- State-based component design
- Separation of concerns between control logic, data, and implementation
- Abstraction of heterogeneous interfaces into a unified meta-model
- Object-oriented design patterns:
  - State pattern
  - Strategy pattern
  - Abstract Factory pattern

## Problem Description

Two different vending machine components are considered:

- A machine that dispenses cappuccino and hot chocolate, supports coins and cards, and offers sugar
- A machine that dispenses coffee, supports coin payment, and offers sugar and cream

Despite differences in interfaces, data types, and supported features, both machines must be driven by the **same abstract EFSM**, rather than by separate machine-specific state machines.

The EFSMs describing the concrete machines are **not** acceptable as the meta-model and must be abstracted into a higher-level MDA-EFSM.

## Required Work

The student is required to:

- Design a **class diagram** representing the MDA-based architecture
- Define the **meta-events** processed by the MDA-EFSM
- Define the **meta-actions**, clearly stating the responsibility of each
- Design a **state diagram/model** of the MDA-EFSM
- Write **pseudocode for the input processors** of each vending machine, mapping concrete operations to meta-events
- Design the object-oriented structure using the required design patterns
- Implement the vending machine components based on the MDA-EFSM design
- Provide execution artifacts that allow the behavior of the machines to be tested

All artifacts must reflect a clean separation between generic behavior and machine-specific details.

## Scope

- Individual assignment
- Design- and architecture-driven
- Emphasis on abstraction quality, correctness, and alignment between models and implementation