require 'csv'

def help
    CSV.open('escuela.csv', 'w') do |csv|
        CSV.read('escuelas.csv').uniq{|x| x[1]}.each do |row|
        csv << row
        end
    end
end

help