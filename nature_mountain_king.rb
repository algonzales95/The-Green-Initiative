# The Green Initiative
# Written in Ruby

#include all the gems and libraries you'll need
require 'open-uri'
require 'yaml'
require 'net/http'
require 'rubygems'
require 'json'

# Class to manage green initiatives
class GreenInitiative
  attr_reader :name

  # constructor
  def initialize(name)
    @name = name
  end

  # method to set the green initiatives
  def set_green_initiative
    puts 'Setting green initiative...'
    # make a uri for accessing data
    uri = URI.open('http://example.com/green_data.json')
    # get the data
    response = Net::HTTP.get(uri)
    # parse the data
    data = JSON.parse(response)
    # set the green initiatives
    data.each do |key, value|
      case key
      when 'eco-friendly-products'
        eco_friendly_products(value)
      when 'energy-efficiency'
        energy_efficiency(value)
      when 'green-transportation'
        green_transportation(value)
      end
    end
    puts 'Green initiative has been set!'
  end

  # method to set eco-friendly products
  def eco_friendly_products(products)
    puts "Setting eco-friendly products: #{products}"
  end

  # method to set energy efficiency
  def energy_efficiency(efficiency)
    puts "Setting energy efficiency: #{efficiency}"
  end

  # method to set green transportation
  def green_transportation(transportation)
    puts "Setting green transportation: #{transportation}"
  end
end

# Create an instance of the class
green = GreenInitiative.new('The Green Initiative')
# Set the green initiative
green.set_green_initiative