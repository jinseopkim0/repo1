
from collections.abc import Sequence
import sys



"""
Helper function for generate_composed_library.py

It takes a single "query" argument
"query" is a string of key=value entries separated by a comma
example: "key1=value1,key2=value2,etc"

it writes the same KVs in a format that generate_library.sh accepts to stdout
example: "--key1 value1 --key2 value2"

it ensures that both keys and values don't contain spaces
"""
def get_generate_library_arguments(query: str):
  result = ''
  raw_arguments_kv = [kv.strip() for kv in query.split(',')]
  for raw_argument_kv in raw_arguments_kv:
    key = _get_raw_argument_component(raw_argument_kv, 0)
    value = _get_raw_argument_component(raw_argument_kv, 1)
    result += f'--{key} "{value}" '
  return result[:-1]

"""
Obtains the value of a single argument in an argument query string.
An argument query string is a comma-separated list of key-value pairs,
for example "key1=val1,key2=val2".
It returns the value for "argument"
"""
def get_argument_value_from_query(query: str, argument :str):
  found_argument = list(filter(lambda x: argument in x, query.split(',')))
  if len(found_argument) == 0:
    raise ValueError(f'query string does not contain the argument {argument}')
  return _get_raw_argument_component(found_argument[0], 1)

"""
Given the input parameter "arguments" (example "--arg1 val1 -arg2 val2"),
this function adds another argument "--arg_key arg_value" to the end
of the argument string
"""
def add_argument(arguments: str, arg_key: str, arg_val: str):
  return f'{arguments} --{arg_key} "{arg_val}"'

def _get_raw_argument_component(raw_argument: str, index: int):
  result = raw_argument.split('=')[index]
  return result

def main(argv: Sequence[str]) -> None:
  if len(argv) < 1:
    raise ValueError('Usage: python generate_composed_library_args.py function_name arg1...argN')

  function_name = argv[1]
  arguments = argv[2:]
  try:
    function = getattr(sys.modules[__name__], function_name)
    print(function(*arguments))
  except AttributeError:
    print(f'function name "{function_name}" not found in utilities.py')
    sys.exit(1)




if __name__ == "__main__":
  main(sys.argv)