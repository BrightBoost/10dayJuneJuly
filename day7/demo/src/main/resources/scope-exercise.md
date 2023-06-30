# Scope exercise

The steps:
- Create three classes: DbConfig, ProductRepository, VehicleDetailsRepository
- Make sure all of these are beans
- Make the repositories depend on DbConfig (inject)
- Set the configuration in the constructor (not a typical best practice)
- Print the results to the console 

The product and vehicles don't share the same database, so the settings need to be different.
Change the scope of the DbConfig in a way that enables this.