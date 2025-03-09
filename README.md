# Vending Machine MDA-EFSM Assignment (CS 586)

This repository contains the solution to a **course assignment** for CS 586 (Spring 2025).  
The assignment focuses on applying **Model-Driven Architecture (MDA)** principles to the design of state-based software components using **Extended Finite State Machines (EFSMs)**.

## Assignment Objective

The goal is to design a **generic, executable MDA-EFSM meta-model** capable of controlling multiple vending machine variants with different:

- Payment mechanisms
- Products dispensed
- Additives offered
- Operation names and data types

A key requirement is that **a single MDA-EFSM** captures the common control behavior of all vending machines, while machine-specific details are handled outside the meta-model.

## Concepts Applied

This assignment evaluates the application of:

- Model-Driven Architecture (MDA)
- Extended Finite State Machines (EFSM)
- State-based modeling
- Separation of concerns between control logic, data, and implementation
- Abstraction of heterogeneous interfaces into a unified meta-model

## Problem Description

Two different vending machine components are considered:

- A machine that dispenses cappuccino and hot chocolate, supports coins and cards, and offers sugar.
- A machine that dispenses coffee, supports coin payment, and offers sugar and cream.

Despite differences in interfaces and behavior, both machines must be driven by the **same abstract EFSM**, rather than by separate machine-specific state machines.

The EFSMs describing the concrete machines are **not** acceptable as the meta-model and must be abstracted into a higher-level MDA-EFSM.

## Required Work

The student is required to:

- Design a **class diagram** representing the MDA-based architecture
- Define the **meta-events** processed by the MDA-EFSM
- Define the **meta-actions**, clearly stating the responsibility of each
- Design a **state diagram/model** of the MDA-EFSM
- Write **pseudocode for the input processors** of each vending machine, mapping concrete operations to meta-events

All artifacts must reflect a clean separation between generic behavior and machine-specific details.

## Scope

- Individual assignment
- Design- and model-focused (not UI or deployment)
- Emphasis on abstraction quality, correctness, and architectural clarity# SoftwareSystemArchitectureCourseHW