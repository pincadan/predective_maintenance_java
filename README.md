# Here's a Java program that implements a "Predictive Maintenance" system for a automotive production line:

This program provides a basic implementation of a Predictive Maintenance system for a automotive production line. Here's how it works:

1. The program initializes an array machineHealth to represent the health status of each machine on the production line. The health status is represented as a percentage value between 0 and 100.

2. The program enters a loop where the user can choose from different options:

- Check machine health: Displays the current health status of all machines.
- Perform maintenance: Allows the user to select a specific machine and perform maintenance by setting its health status to 100%.
- Exit: Terminates the program.

3. The checkMachineHealth method iterates over the machineHealth array and prints the health status of each machine.

4. The performMaintenance method allows the user to enter the number of a machine and perform maintenance by updating its health status to 100%.

5. The program continues to loop until the user chooses to exit.

Note: This is a basic implementation and does not include all the complexities of a real-world predictive maintenance system. 

It assumes that the machine health is checked periodically and maintenance is performed based on predefined criteria.

