const graph = {
  f: ['g', 'i'],
  g: ['h'],
  h: [],
  i: ['g', 'k'],
  j: ['i'],
  k: []
};




const hasPath = (graph, src, dst) => {
  let queue = [src];
  
  let flag = false;
  
  while ( queue.length !== 0 ) {
    let current = queue.shift();
    
    for ( let child of graph[current] ) {
      if ( child === dst ) {
        flag = true;
      }
      queue.push(child)
    }
    
  }
  
  return flag;
  
};

hasPath(graph, 'f', 'k')
